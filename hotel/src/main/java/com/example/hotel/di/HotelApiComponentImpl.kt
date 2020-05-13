package com.example.hotel.di

import com.example.hotel_api.di.HotelApiComponent
import dagger.Component

@Component(modules = [HotelApiModule::class])
interface HotelApiComponentImpl : HotelApiComponent {

}