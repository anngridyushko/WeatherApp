package com.example.weatherapp.ui.weather

import com.example.weatherapp.ui.BasePresenter
import com.example.weatherapp.ui.forecast.ForecastContract
class WeatherPresenter: BasePresenter<WeatherContract.View>(), WeatherContract.Presenter  {

    override fun onViewCreated() {
        super.onViewCreated()
    }

}