package com.example.searchapp.Retrofit


import com.example.searchapp.API.SearchAPI
import com.example.searchapp.API.Constants
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object SearchClient {

    private val retrofit by lazy {
        val interceptor = HttpLoggingInterceptor()
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY)

        Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .client(OkHttpClient.Builder().addInterceptor(interceptor).build())
            .build()
    }

    val api: SearchAPI by lazy {
        retrofit.create(SearchAPI::class.java)
    }



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