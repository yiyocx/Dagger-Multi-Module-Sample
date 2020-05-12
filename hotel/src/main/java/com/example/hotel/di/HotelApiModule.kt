package com.example.hotel.di

import com.example.hotel.HotelSearchServiceImpl
import com.example.hotel_api.HotelSearchService
import dagger.Binds
import dagger.Module


@Module
abstract class HotelApiModule {

    //    @ScreenScope
    @Binds
    abstract fun providesHotelSearchService(hotelSearchService: HotelSearchServiceImpl): HotelSearchService
}