package com.example.weatherapp.model

import android.os.Parcelable
import android.view.Window
import kotlinx.parcelize.Parcelize

@Parcelize
data class Weather(
    val weather: List<WeatherMain>,
    val main: MainParameters,
    val visibility: Int,
    val wind: Wind,
    val clouds : Clouds,
) : Parcelable

@Parcelize
data class WeatherMain(
    val id: Int,
    val main: String,
    val description: String,
    val icon: String
) : Parcelable

@Parcelize
data class MainParameters(
    val temp: Double,
    val feels_like: Double,
    val temp_min: Double,
    val temp_max: Double,
    val pressure: Int,
    val humidity: Int
) : Parcelable

@Parcelize
data class Wind(
    val speed: Double,
    val deg: Int
) : Parcelable

@Parcelize
data class Clouds(
    val all: Int
) : Parcelable