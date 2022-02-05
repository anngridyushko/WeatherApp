package com.example.weatherapp.di

import com.example.weatherapp.data.WeatherApi
import com.example.weatherapp.model.WeatherRepo
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepoModule {

    @Provides
    @Singleton
    fun provideWeatherRepository(api: WeatherApi): WeatherRepo = WeatherRepo(api)
}