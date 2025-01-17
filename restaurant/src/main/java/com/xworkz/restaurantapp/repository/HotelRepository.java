package com.xworkz.restaurantapp.repository;

import com.xworkz.restaurantapp.entity.HotelEntity;

public interface HotelRepository {
    Boolean save(HotelEntity hotelEntity);
    HotelEntity getById(Integer id);
    HotelEntity getByName(String hotelName);
    int updateByName(String location, String hotel_name);
    String getLocationById(Integer id);
    HotelEntity getLocationAndStateById(Integer id);
    Integer getIdByLocation(String location);
    String getLocationByName(String hotelName);
    HotelEntity getLocationAndStateByName(String hotelName);
    HotelEntity getLocationNameAndStateById(Integer id);

}
