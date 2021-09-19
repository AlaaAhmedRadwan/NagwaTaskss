package com.example.videosdownloader.datalayer


import com.example.videosdownloader.model.MainData
import com.example.videosdownloader.model.MainDataItem
import io.reactivex.Observable
import retrofit2.http.*
import retrofit2.http.Url

import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.Response

import retrofit2.http.GET

import retrofit2.http.Streaming





interface APIServices {

    @GET("movies")
    fun GetMainData():
            Observable<List<MainDataItem>>

}


