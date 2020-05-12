package com.example.daggermultimodule.di

import com.example.flight.di.FlightComponent
import com.example.hotel.di.HotelComponent
import dagger.Component

@Component(dependencies = [FlightComponent::class, HotelComponent::class])
interface AppComponent {

}