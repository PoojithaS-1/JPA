package com.xworkz.restaurantapp.service;

import com.xworkz.restaurantapp.entity.HotelEntity;

public interface HotelService {
    void save(HotelEntity hotelEntity);
    HotelEntity getById(Integer id);
    HotelEntity getByName(String hotelName);
    int updateByName(String hotelName, String location);
    String getLocationById(Integer id);
    HotelEntity getLocationAndStateById(Integer id);
    Integer getIdByLocation(String location);
    String getLocationByName(String hotelName);
    HotelEntity getLocationAndStateByName(String hotelName);
    HotelEntity getLocationNameAndStateById(Integer id);

}
