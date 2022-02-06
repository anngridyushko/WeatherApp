package com.example.weatherapp.di

import com.example.weatherapp.data.network.WeatherApiService
import com.example.weatherapp.data.repository.WeatherRepositoryImpl
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
    fun provideWeatherRepository(apiService: WeatherApiService): WeatherRepositoryImpl = WeatherRepositoryImpl(apiService)
}