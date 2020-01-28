package com.example.daggerapp

import android.app.Application

class DaggerApp : Application() {
    private lateinit var car : CarComponent

    override fun onCreate() {
        super.onCreate()
        car = DaggerCarComponent.builder()
                                .horsePower(100)
                                .engineCapacity(1000)
                                .build()
    }

    fun getCarComponent() : CarComponent {
        return car
    }
}