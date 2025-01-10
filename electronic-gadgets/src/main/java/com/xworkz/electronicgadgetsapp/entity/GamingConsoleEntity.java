package com.xworkz.electronicgadgetsapp.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
@Entity
@Table(name = "gaming_consoles")

public class GamingConsoleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "console_id")
    private Integer consoleId;
    private String name;
    private String description;
    private Double price;
    private String brand;
    private String processor;
}
