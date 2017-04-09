package com.example.tests;

import com.example.models.ExportOption;
import com.example.services.BaseService;
import com.example.services.MyService;
import com.google.gson.GsonBuilder;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MyTests {
    private final static Logger logger = Logger.getLogger(DatasetsTest.class);

    @Test  // проверка вариантов экспорта одного из разделов безопасности
    public void getExportOptionsTest() {
        ArrayList<String> checkList = new ArrayList<>();
        checkList.add("json");
        checkList.add("xml");
        checkList.add("xlsx");

        Retrofit retrofit = BaseService.getRetrofit()
                .baseUrl("https://data.mos.ru")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        MyService service = retrofit.create(MyService.class);
        // https://data.mos.ru/api/datasets/expformats/?datasetId=2386
        try {
            Response<List<ExportOption>> execute = service.getExportOptions().execute();
            for (ExportOption item : execute.body()) {
                checkList.remove(item.getFormat());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // if checkList пуст => мы отметили в нем все ожидаемые результаты от сервера
        Assert.assertEquals(checkList.isEmpty(), true);
    }

    @Test  // проверка картинки
    public void getImageTest() {
        Retrofit retrofit = BaseService.getRetrofit()
                .baseUrl("https://evp.mos.ru")
                .addConverterFactory(GsonConverterFactory.create(new GsonBuilder().setLenient().create()))
                .build();

        MyService service = retrofit.create(MyService.class);
        try {
            Response<String> answer = service.getImage().execute();//.raw().toString();
            // проверить саму кодировку картинки не получилось, т.к. в response.body() лежит PNG
            // проверяем, что по запросу вернулся код 200 и тип ответа - картинка в png
            Assert.assertEquals(answer.raw().code() == 200 &&
                            answer.raw().body().contentType().type().equals("image") &&
                            answer.raw().body().contentType().subtype().equals("png"),
                    true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
