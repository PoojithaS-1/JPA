package com.xworkz.headsetsystem.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "headphone_info")
@NamedQuery(name = "getById", query = "select headphone from HeadPhoneEntity headphone where headphone.id=:id")
@NamedQuery(name = "getByName", query = "select headphone from HeadPhoneEntity headphone where headphone.name=:name")
@NamedQuery(name = "updateNameById", query = "update HeadPhoneEntity headphone set headphone.name=:name where headphone.id=:id")
@NamedQuery(name = "updateDescriptionByid", query = "update HeadPhoneEntity headphone set headphone.description=:description where headphone.id=:id")
@NamedQuery(name = "updateBrandByName", query = "update HeadPhoneEntity headphone set headphone.brand=:brand where headphone.name=:name")
@ToString
public class HeadPhoneEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String description;

    private Double price;

    private String brand;

    private String driverSize;
}
