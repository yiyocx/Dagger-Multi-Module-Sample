package com.example.hotel.di

import com.example.hotel_api.di.HotelApiComponent
import com.example.hotel.di.HotelApiModule
import dagger.Component

@Component(modules = [HotelApiModule::class])
interface HotelApiComponentImpl : HotelApiComponent {

}