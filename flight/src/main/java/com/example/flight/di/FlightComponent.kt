package com.example.flight.di

import com.example.flight.FlightSomethingActivity
import com.example.hotel_api.di.HotelApiComponent
import dagger.Component

@Component(dependencies = [HotelApiComponent::class])
interface FlightComponent {

    fun inject(flightSomethingActivity: FlightSomethingActivity)
}