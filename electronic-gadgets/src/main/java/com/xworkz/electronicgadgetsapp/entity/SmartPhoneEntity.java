package com.xworkz.electronicgadgetsapp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "smartphone")
@Entity
public class SmartPhoneEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer gadgetId;
    private String name;
    private String description;
    private Double price;
    private String brand;
    @Column(name = "os")
    private String operatingSystem;
}
