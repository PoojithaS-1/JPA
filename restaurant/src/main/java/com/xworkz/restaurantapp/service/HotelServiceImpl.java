package com.xworkz.restaurantapp.service;

import com.xworkz.restaurantapp.entity.HotelEntity;
import com.xworkz.restaurantapp.repository.HotelRepository;
import com.xworkz.restaurantapp.repository.HotelRepositoryImpl;

public class HotelServiceImpl implements HotelService{
    static HotelRepository hotelRepository=new HotelRepositoryImpl();
    @Override
    public void save(HotelEntity hotelEntity) {
        Boolean save=hotelRepository.save(hotelEntity);
        if (save){
            System.out.println("Data saved successfully");
        }else {
            System.out.println("Data  not saved successfully");

        }
    }

    @Override
    public HotelEntity getById(Integer id) {
        HotelEntity hotelEntity = hotelRepository.getById(id);
        if (hotelEntity != null) {
            System.out.println("Hotel id found\n" + hotelEntity);
        }
        else {
            System.out.println("Hotel id not found");
        }
        return hotelEntity;

    }

    @Override
    public HotelEntity getByName(String hotelName) {
        HotelEntity hotelEntity = hotelRepository.getByName(hotelName);
        if (hotelEntity != null) {
            System.out.println("Hotel name found\n" + hotelEntity);
        }
        else {
            System.out.println("Hotel name not found");
        }
        return hotelEntity;
    }

    @Override
    public int updateByName(String hotelName, String location) {
        int rows=hotelRepository.updateByName(location, hotelName);
        if (rows>0){
            System.out.println("Location is updated");
        }else {
            System.out.println("Location not updated");
        }return 0;
    }

    @Override
    public String getLocationById(Integer id) {
        String location= hotelRepository.getLocationById(id);
        if (location !=null){
            System.out.println(location);
        }else {
            System.out.println("Location not found");
        }
        return null;
    }

    @Override
    public HotelEntity getLocationAndStateById(Integer id) {
        HotelEntity locationAndState= hotelRepository.getLocationAndStateById(id);
        if (locationAndState !=null){
            System.out.println(locationAndState);
        }else {
            System.out.println("Location and State not found");
        }
        return null;
    }

    @Override
    public Integer getIdByLocation(String location) {
        Integer id= hotelRepository.getIdByLocation(location);
        if (id !=null){
            System.out.println(id);
        }else {
            System.out.println("Id not found");
        }
        return 0;
    }

    @Override
    public String getLocationByName(String hotelName) {
        String location= hotelRepository.getLocationByName(hotelName);
        if (location !=null){
            System.out.println(location);
        }else {
            System.out.println("Location not found");
        }
        return null;
    }

    @Override
    public HotelEntity getLocationAndStateByName(String hotelName) {
        HotelEntity locationAndState= hotelRepository.getLocationAndStateByName(hotelName);
        if (locationAndState !=null){
            System.out.println(locationAndState);
        }else {
            System.out.println("Location and State not found");
        }
        return null;
    }

    @Override
    public HotelEntity getLocationNameAndStateById(Integer id) {
        HotelEntity locationNameAndState = hotelRepository.getLocationNameAndStateById(id);
        if (locationNameAndState !=null){
            System.out.println(locationNameAndState);
        }else {
            System.out.println("Location, Hotel_name and State not found");
        }
        return null;
    }

}
