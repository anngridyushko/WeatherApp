package com.example.weatherapp.ui.weather

import com.example.weatherapp.ui.BaseContract

interface WeatherContract {

    interface View: BaseContract.View {
        fun setupNavigation()
        //fun diplaySmth()
    }

    interface Presenter: BaseContract.Presenter<View> {

    }
}