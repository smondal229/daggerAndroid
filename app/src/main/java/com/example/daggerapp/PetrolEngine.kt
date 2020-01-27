package com.example.daggerapp

import android.util.Log
import javax.inject.Inject
import javax.inject.Named

class PetrolEngine : Engine {

    var horsePower : Int

    @Inject constructor(@Named("horse_power") horsePower: Int){
        this.horsePower = horsePower
    }

    override fun start() {
        Log.d("Engine", "Broom..., horsePower: ${this.horsePower}")
    }
}