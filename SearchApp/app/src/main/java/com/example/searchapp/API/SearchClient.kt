package com.example.searchapp.API

import com.example.searchapp.BuildConfig
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object SearchClient {



//    private val okHttpClient = OkHttpClient.Builder()
//        .addInterceptor(HttpLoggingInterceptor().apply {
//            level = HttpLoggingInterceptor.Level.NONE
//        }).addInterceptor {
//            val requset = it.request()
//                .newBuilder()
//                .addHeader("Authorization", "KaKaoAK ${BuildConfig.API_KEY}")
//                .build()
//
//            val response = it.proceed(requset)
//            response
//        }.build()
//
//    private val getRetrofit = Retrofit.Builder()
//            .baseUrl(KaKaoApi.BASE_URL)
//            .client(okHttpClient)
//            .addConverterFactory(GsonConverterFactory.create())
//            .build()
//
//    val getRetrofitService: SearchAPI = getRetrofit.create(SearchAPI::class.java)


}