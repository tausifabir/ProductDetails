package com.example.test;


import com.example.test.Model.ProductDetails;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {

    //productDetails
    @GET("product-core/suzuki-gsx-r150-fi-dual-channel-abs-yvj2/0/?format=json")
    Call<ProductDetails> getProductDetails();



}
