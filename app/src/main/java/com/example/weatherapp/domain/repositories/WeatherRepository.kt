package com.example.weatherapp.domain.repositories

import com.example.weatherapp.domain.entities.Weather
import io.reactivex.rxjava3.core.Observable

interface WeatherRepository {

    fun getWeather(lat: Int, lon: Int): Observable<Weather>

    fun getForecast(lat: Int, lon: Int): Observable<Weather>
}