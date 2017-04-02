package com.example.tests;

import com.example.models.Dataset;
import com.example.models.OurResponse;
import com.example.services.BaseService;
import com.example.services.DataSetsService;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import okhttp3.Request;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import retrofit2.Call;

import java.io.IOException;
import java.lang.reflect.Field;

public class DatasetsTest {
    private final static Logger logger = Logger.getLogger(DatasetsTest.class);
    @Test
    public void getDataSetTest() {
        final String[] expectedFields = {"Id","VersionNumber","ReleaseNumber",
                "Caption","CategoryId", "DepartmentId", "PublishDate",
                "FullDescription","Keywords",
                "ContainsGeodata",
                "ContainsAccEnvData",
                "IsForeign",
                "IsSeasonal",
                "Season",
                "IsArchive",
                "IsNew",
                "LastUpdateDate",
                "SefUrl",
                "IdentificationNumber"};
        DataSetsService service = BaseService.getRetrofit().create(DataSetsService.class);

        try {
            Call<OurResponse<Dataset>> responseCall = service.getDataSets(1, 1);

            OurResponse<Dataset> response = responseCall.execute().body();
            logger.debug(response);

            response.getItems().forEach(item -> {
                JsonElement jsonItem = new Gson().fromJson(item.toString(),
                        JsonElement.class);
                for(String field : expectedFields) {
                    logger.debug(String.format("Field %s checked", field));
                    Assert.assertTrue(jsonItem.getAsJsonObject().has(field),
                            String.format("Expected field is absent in respose. Expected: %s", field));
                }
            });

            //Assert.assertNotEquals(0L, response.getCount(), "Count is 0");
        } catch (IOException e) {
            logger.error(e);
        }
    }
    //dirty hack
    private Request getRequestFromCall(Call call) {
        Field fld;
        try {
            fld = Call.class.getDeclaredField("originalRequest");
            fld.setAccessible(true);
            return (Request) fld.get(call);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            throw new RuntimeException("Can't get Request data from a call object", e);
        }
    }
}
