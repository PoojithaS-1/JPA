package com.xworkz.restaurantapp.service;

import com.xworkz.restaurantapp.entity.HotelEntity;

public class HotelServiceRunner {

    public static void main(String[] args) {
        HotelService hotelService=new HotelServiceImpl();
//        HotelEntity hotelEntity=new HotelEntity(null,"Isiri",true,"Shimoga","karnataka");
//        hotelService.save(hotelEntity);
//        hotelService.getById(3);
//        hotelService.getByName("Isiri");
//        hotelService.updateByName("Nayaz","vijayanagar");
//        hotelService.getLocationById(5);
//        hotelService.getLocationAndStateById(1);
        hotelService.getIdByLocation("Srinagar");
        hotelService.getLocationByName("Isiri");
        hotelService.getLocationAndStateByName("Nayaz");
        hotelService.getLocationNameAndStateById(7);

    }
}
