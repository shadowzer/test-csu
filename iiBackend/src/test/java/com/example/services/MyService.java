package com.example.services;

import com.example.models.ExportOption;
import com.example.models.FirefighterDataset;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.http.GET;

import java.util.ArrayList;
import java.util.List;

public interface MyService {
    @GET("/api/datasets/expformats/?datasetId=2386")
    Call<List<ExportOption>> getExportOptions();

    @GET("/upload/evp_navigator/561/6c4e7955d16c6a2ff187c51fe34bee95.png")
    Call<String> getImage();

    @GET("/apiproxy/opendata/7710474791-dannye-vyzovov-pojarnoy-slujby-po-ao-goroda-moskvy/meta.json")
    Call<FirefighterDataset> getFirefighterDataSetPassport();
}
