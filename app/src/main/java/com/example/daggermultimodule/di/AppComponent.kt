package com.example.daggermultimodule.di

import com.example.hotel_api.di.HotelApiComponent
import dagger.Component

@Component(
    dependencies = [
        HotelApiComponent::class
    ]
)
interface AppComponent {

}