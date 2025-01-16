package com.xworkz.electronicgadgetsapp.entitylaptop;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@NamedQuery(name = "updateNameById",query = "update LaptopEntity laptop set laptop.name=:name where laptop.laptopId=:laptopId")
@NamedQuery(name = "updateBrandById",query = "update LaptopEntity laptop set laptop.brand=:brand where laptop.laptopId=:laptopId")
@NamedQuery(name = "updatePriceByBrand",query = "update LaptopEntity laptop set laptop.price=:price where laptop.brand=:brand")

@Table(name = "laptops")
@ToString
public class LaptopEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer laptopId;
    private String name;
    private String description;
    private Double price;
    private String brand;
    private String processor;
}
