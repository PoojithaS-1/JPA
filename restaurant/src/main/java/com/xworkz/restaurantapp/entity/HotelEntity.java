package com.xworkz.restaurantapp.entity;

import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "hotel_info")
@NamedQuery(name = "getAllData",query = "select hotel from HotelEntity hotel")
@NamedQuery(name = "getByName",query = "select hotel from HotelEntity hotel where hotel.hotelName=:hotelName")
@NamedQuery(name = "count",query = "select count(hotel) from HotelEntity hotel where hotel.state=:state")
@NamedQuery(name = "updateByName",query = "update HotelEntity hotel set hotel.location=:location where hotel.hotelName=:hotelName")
@NamedQuery(name="getLocationById",query = "select hotel.location from HotelEntity hotel where hotel.id=:id")
@NamedQuery(name="getLocationAndStateById",query = "select new HotelEntity(hotel.location,hotel.state)  from HotelEntity hotel where hotel.id=:id")

@NamedQuery(name="getIdByLocation",query = "select hotel.id from HotelEntity hotel where hotel.location=:location")
@NamedQuery(name="getLocationByName",query = "select hotel.location from HotelEntity hotel where hotel.hotelName=:hotelName")
@NamedQuery(name="getLocationAndStateByName",query = "select new HotelEntity(hotel.location,hotel.state)  from HotelEntity hotel where hotel.hotelName=:hotelName")
@NamedQuery(name="getLocationNameAndStateById",query = "select new HotelEntity(hotel.location,hotel.state,hotel.hotelName)  from HotelEntity hotel where hotel.id=:id")

@ToString

public class HotelEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String hotelName;
    private Boolean taste;
    private String location;
    private String state;

    public HotelEntity(String location,String state){
        this.location=location;
        this.state=state;
    }
    public HotelEntity(String location,String state,String hotelName){
        this.location=location;
        this.state=state;
        this.hotelName=hotelName;
    }
}
