package com.example.hotel_api.di

import com.example.hotel_api.HotelSearchService

interface HotelApiComponent {
    fun getHotelSearchService(): HotelSearchService
}