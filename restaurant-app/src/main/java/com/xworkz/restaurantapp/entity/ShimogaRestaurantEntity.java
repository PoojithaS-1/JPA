package com.xworkz.restaurantapp.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "shimoga_restaurant")
public class ShimogaRestaurantEntity {
    @Id
    @Column(name = "id")
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "location")
    private String location;
    @Column(name = "rating")
    private Double rating;
    @Column(name = "price")
    private Double price;
    @Column(name = "amenities")
    private String amenities;
    @Column(name = "cuisine")
    private String cuisine;
    @Column(name = "contact_no")
    private Long contactNo;


}
