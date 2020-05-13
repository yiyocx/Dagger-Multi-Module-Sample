package com.example.hotel

import com.example.core.ComponentFactory
import com.example.hotel.di.DaggerHotelApiComponentImpl
import com.example.hotel_api.di.HotelApiComponent

class HotelApiComponentFactory : ComponentFactory<HotelApiComponent> {
    override fun createComponent(): HotelApiComponent {
        return DaggerHotelApiComponentImpl.create()
    }
}