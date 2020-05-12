package com.example.hotel

import com.example.hotel_api.HotelSearchService
import javax.inject.Inject

class HotelSearchServiceImpl @Inject constructor() : HotelSearchService {
    override fun searchHotel(): String {
        return "Searching hotel. My implementation comes from `hotel` android module "
    }
}