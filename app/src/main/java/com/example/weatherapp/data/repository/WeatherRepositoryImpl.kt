package com.example.weatherapp.data.repository

import com.example.weatherapp.data.network.WeatherApiService
import com.example.weatherapp.domain.repositories.WeatherRepository

class WeatherRepositoryImpl(private val apiService: WeatherApiService): WeatherRepository {

    override fun getWeather(lat: Int, lon: Int) = apiService.getCurrentWeather(lat, lon)

    override fun getForecast(lat: Int, lon: Int) = apiService.getForecastWeather(lat, lon)
}