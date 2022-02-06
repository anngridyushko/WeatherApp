package com.example.weatherapp.ui.forecast

import com.example.weatherapp.ui.BaseContract

interface ForecastContract {

    interface View: BaseContract.View {
        fun setupNavigation()
        //fun diplaySmth()
    }

    interface Presenter: BaseContract.Presenter<View> {

    }

}