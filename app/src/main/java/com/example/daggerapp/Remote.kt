package com.example.daggerapp

import android.util.Log
import javax.inject.Inject

class Remote @Inject constructor(){
    fun setListener(car: Car) {
        Log.d("Remote","$car has been locked")
    }
}