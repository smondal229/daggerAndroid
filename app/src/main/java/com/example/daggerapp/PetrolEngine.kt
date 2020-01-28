package com.example.daggerapp

import android.util.Log
import javax.inject.Inject
import javax.inject.Named

class PetrolEngine : Engine {

    var horsePower : Int
    var capacity : Int

    @Inject constructor(@Named("horse_power") horsePower: Int, @Named("capacity") capacity : Int) {
        this.horsePower = horsePower
        this.capacity = capacity
    }


    override fun start() {
        Log.d("Engine", "Broom..., horsePower: ${this.horsePower}, capacity: ${this.capacity}")
    }
}