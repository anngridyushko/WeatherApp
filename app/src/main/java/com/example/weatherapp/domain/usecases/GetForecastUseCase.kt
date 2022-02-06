package com.example.weatherapp.domain.usecases

import com.example.weatherapp.domain.repositories.WeatherRepository

class GetForecastUseCase(private val repo: WeatherRepository) {

    operator fun invoke(lat: Int, lon: Int) = repo.getForecast(lat, lon)
}