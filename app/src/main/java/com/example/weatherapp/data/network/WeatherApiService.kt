package com.example.weatherapp.data.network

import com.example.weatherapp.domain.entities.Weather
import com.example.weatherapp.domain.common.WeatherConsts
import io.reactivex.rxjava3.core.Observable
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface WeatherApiService {

    @GET("weather")
    @Headers(
        "Content-Type: application/json"
    )
    fun getCurrentWeather(
        @Query("lat") lat: Int,
        @Query("lon") lon: Int,
        @Query("appid") appid: String  = WeatherConsts.key
    ): Observable<Weather>

    @GET("forecast")
    @Headers(
        "Content-Type: application/json"
    )
    fun getForecastWeather(
        @Query("lat") lat: Int,
        @Query("lon") lon: Int,
        @Query("appid") appid: String  = WeatherConsts.key
    ): Observable<Weather>
}