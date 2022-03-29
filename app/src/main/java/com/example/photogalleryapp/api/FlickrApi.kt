package com.example.photogalleryapp.api

import retrofit2.http.GET
import retrofit2.Call

interface FlickrApi {

    @GET("/")
    fun fetchContents():Call<String>
}