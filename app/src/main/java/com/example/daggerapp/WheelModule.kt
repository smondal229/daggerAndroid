package com.example.daggerapp

import dagger.Module
import dagger.Provides

@Module
object WheelModule {// Provides for third party module

    @Provides
    fun provideTire(): Tire {
        return Tire()
    }

    @Provides
    fun provideWheel(tire: Tire): Wheel {
        return Wheel(tire)
    }
}