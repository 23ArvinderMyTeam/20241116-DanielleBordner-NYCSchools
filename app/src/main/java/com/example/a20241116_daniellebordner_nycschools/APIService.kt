package com.example.a20241116_daniellebordner_nycschools

import retrofit2.Response
import retrofit2.http.GET

interface APIService {
    @GET("/resource/s3k6-pzi2.json")
    fun cityofnewyork() : Response<ArrayList<ResponseDataItem>>
}