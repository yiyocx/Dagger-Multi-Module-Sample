package com.example.daggermultimodule

import android.app.Application
import com.example.core.ApiComponentFactoryHolder
import com.example.hotel.HotelApiComponentFactory

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        ApiComponentFactoryHolder.register(HotelApiComponentFactory())
    }
}