package com.example.daggerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var car:Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val daggerCar: CarComponent = DaggerCarComponent.builder().horsePower(100).build()
        daggerCar.inject(this)

        Log.d("Car instance", "$car")
        car.drive()
    }
}
