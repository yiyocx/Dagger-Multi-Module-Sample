package com.example.flight

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.core.ApiComponentFactoryHolder
import com.example.flight.di.DaggerFlightComponent
import com.example.hotel_api.HotelSearchService
import com.example.hotel_api.di.HotelApiComponent
import javax.inject.Inject

class FlightSomethingActivity : AppCompatActivity() {

    @Inject
    lateinit var hotelSearchService: HotelSearchService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_flight_something)

        DaggerFlightComponent.builder()
            .hotelApiComponent(getHotelApiComponent())
            .build()
            .inject(this)
    }

    override fun onResume() {
        super.onResume()
        println(hotelSearchService.searchHotel())
    }

    private fun getHotelApiComponent(): HotelApiComponent {
        return ApiComponentFactoryHolder.getComponent(HotelApiComponent::class.java)
            .createComponent()
    }
}
