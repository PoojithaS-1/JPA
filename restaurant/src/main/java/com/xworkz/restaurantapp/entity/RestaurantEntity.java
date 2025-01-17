package com.xworkz.restaurantapp.entity;

import lombok.*;

import javax.persistence.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "restaurant")
public class RestaurantEntity {
    @Id
    @Column(name = "id")
    private Integer id;
    @Column(name = "r_name")
    private String rName;
    @Column(name = "rating")
    private Double rating;
    @Column(name = "location")
    private String location;
    @Column(name = "contact_no")
    private Long contact_No;
    @Column(name = "pincode")
    private Long pincode;
    @Column(name = "r_type")
    private String rType;
}
