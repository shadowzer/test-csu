package com.example.tests;

import com.example.models.ExportOption;
import com.example.services.MyService;
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

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://data.mos.ru")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        MyService service = retrofit.create(MyService.class);
        // https://data.mos.ru/api/datasets/expformats/?datasetId=2386
        service.getExportOptions().enqueue(new Callback<List<ExportOption>>() {
            @Override
            public void onResponse(Call<List<ExportOption>> call, Response<List<ExportOption>> response) {
                for (ExportOption item : response.body()) {
                    checkList.remove(item);
                }
            }

            @Override
            public void onFailure(Call<List<ExportOption>> call, Throwable throwable) {
                logger.error(throwable.getMessage());
            }
        });

        Assert.assertEquals(checkList.isEmpty(), false);
    }

    @Test  // проверка картинки
    public void getImageTest() {
        final String EXPECTED_ANSWER = "data:image/png;base64,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";
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://evp.mos.ru")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        MyService service = retrofit.create(MyService.class);
        service.getImage().enqueue(new Callback<String>() {
            @Override
            public void onResponse(Call<String> call, Response<String> response) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Assert.assertEquals(response.body(), EXPECTED_ANSWER);
            }

            @Override
            public void onFailure(Call<String> call, Throwable throwable) {

            }
        });
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
