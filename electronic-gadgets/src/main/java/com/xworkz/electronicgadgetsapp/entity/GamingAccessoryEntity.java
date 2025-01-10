package com.xworkz.electronicgadgetsapp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import javax.persistence.*;

@Entity
@Table(name = "gaming_accessories")
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class GamingAccessoryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String description;
    private Double price;
    private String brand;
    private String compatibility;
}