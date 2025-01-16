package com.xworkz.electronicgadgetsapp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;


@Entity
@Table(name = "smartwatches")
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor

public class SmartWatchEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer watchId;
    private String name;
    private String description;
    private Double price;
    private String brand;
    private String compatibility;
}
