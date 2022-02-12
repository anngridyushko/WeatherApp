package com.example.weatherapp.domain.entities

import android.os.Parcelable
import com.squareup.moshi.Json
import kotlinx.parcelize.Parcelize

@Parcelize
data class Weather(
    val weather: List<WeatherItem>,
    val main: MainParameters,
    val wind: Wind,
    val clouds: Clouds,
    val rain: Rain,
    val snow: Snow,
    val dt: Int
) : Parcelable

@Parcelize
data class WeatherItem(
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

@Parcelize
data class Rain(
    @Json(name = "1h") val h1: Int,
    @Json(name = "3h") val h3: Int,
): Parcelable

@Parcelize
data class Snow(
    @Json(name = "1h") val h1: Int,
    @Json(name = "3h") val h3: Int,
): Parcelable