package com.example.weatherapp.domain.entities

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Forecast(
    val list: List<Weather>
) : Parcelable