package com.example.daggerapp

import dagger.Module
import dagger.Provides
import javax.inject.Inject

@Module
class PetrolEngineModule {

    private var horsePower: Int

    constructor(horsePower: Int) {
        this.horsePower = horsePower
    }

    @Provides
    fun provideHorsePower(): Int {
        return horsePower
    }

    @Provides
    fun provideEngine(engine: PetrolEngine): Engine
    {
        return engine
    }
}