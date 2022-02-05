package com.example.weatherapp.model

import com.example.weatherapp.data.WeatherApi

class WeatherRepo(val api: WeatherApi) {

    fun getWeather(lat: Int, lon: Int) = api.getCurrentWeather(lat, lon)
    fun getForecast(lat: Int, lon: Int) = api.getForecastWeather(lat, lon)
}