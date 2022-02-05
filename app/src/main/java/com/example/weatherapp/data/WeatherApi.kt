package com.example.weatherapp.data

import com.example.weatherapp.model.Weather
import com.example.weatherapp.util.Const
import io.reactivex.rxjava3.core.Observable
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface WeatherApi {

    @GET("weather")
    @Headers(
        "Content-Type: application/json"
    )
    fun getCurrentWeather(
        @Query("lat") lat: Int,
        @Query("lon") lon: Int,
        @Query("appid") appid: String  = Const.key
    ): Observable<Weather>

    @GET("forecast")
    @Headers(
        "Content-Type: application/json"
    )
    fun getForecastWeather(
        @Query("lat") lat: Int,
        @Query("lon") lon: Int,
        @Query("appid") appid: String  = Const.key
    ): Observable<Weather>
}