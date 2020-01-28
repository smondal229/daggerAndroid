package com.example.daggerapp

import dagger.BindsInstance
import dagger.Component
import javax.inject.Named
import javax.inject.Singleton

@PerActivity
@Component (
    modules = [WheelModule::class, PetrolEngineModule::class]
)
interface CarComponent {

    fun getCar(): Car

    fun inject(mainActivity: MainActivity)

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun horsePower(@Named("horse_power") horsePower: Int): Builder

        @BindsInstance
        fun engineCapacity(@Named("capacity") capacity: Int): Builder

        fun build(): CarComponent
    }
}