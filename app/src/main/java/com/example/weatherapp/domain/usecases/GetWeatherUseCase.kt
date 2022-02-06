package com.example.weatherapp.domain.usecases

import com.example.weatherapp.domain.repositories.WeatherRepository

class GetWeatherUseCase(private val repo: WeatherRepository) {

    operator fun invoke(lat: Int, lon: Int) = repo.getWeather(lat, lon)
}