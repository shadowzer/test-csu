package com.example.services;

import com.example.models.Dataset;
import com.example.models.OurResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface DataSetsService {
    @GET("datasets?$inlinecount=allpages")
    Call<OurResponse<Dataset>> getDataSets(@Query("$top") int top, @Query("$skip") int skip);

    @GET("datasets?$skip=1&$top=1&$inlinecount=allpages")
    Call<OurResponse<Dataset>> getFirstDataSet();
}
