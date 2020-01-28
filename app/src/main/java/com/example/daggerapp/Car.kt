package com.example.daggerapp

import android.util.Log
import javax.inject.Inject

@PerActivity
class Car {

    private var engine : Engine
    private var wheel : Wheel
    private var driver: Driver

    @Inject
    constructor(driver: Driver, engine: Engine, wheel: Wheel)
    {
        this.wheel = wheel
        this.engine = engine
        this.driver = driver
    }

    fun drive(): Unit {
        engine.start()
        Log.d("Car", "${this.driver} driving...")
    }

    @Inject
    fun enableRemote(remote : Remote){
        remote.setListener(this)
    }
}