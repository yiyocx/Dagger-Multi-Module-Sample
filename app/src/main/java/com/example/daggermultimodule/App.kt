package com.example.daggermultimodule

import android.app.Application
import com.example.daggermultimodule.di.DaggerAppComponent
import com.example.flight.di.DaggerFlightComponent
import com.example.flight.di.FlightComponent
import com.example.hotel.di.DaggerHotelApiComponentImpl
import com.example.hotel.di.DaggerHotelComponent

class App : Application() {

    lateinit var flightComponent: FlightComponent

    override fun onCreate() {
        super.onCreate()

        val hotelApiComponent = DaggerHotelApiComponentImpl.builder()
            .build()

        flightComponent = DaggerFlightComponent.builder()
            .hotelApiComponent(hotelApiComponent)
            .build()

        val hotelComponent = DaggerHotelComponent.builder().build()

        DaggerAppComponent.builder()
            .flightComponent(flightComponent)
            .hotelComponent(hotelComponent)
            .build()
    }
}