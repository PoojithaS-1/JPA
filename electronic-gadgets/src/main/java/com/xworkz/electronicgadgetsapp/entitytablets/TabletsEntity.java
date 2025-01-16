package com.xworkz.electronicgadgetsapp.entitytablets;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Data
@AllArgsConstructor
@Entity
@NoArgsConstructor
@NamedQuery(name = "updateDescriptionByid", query = "update TabletsEntity tablets set tablets.description=:description where tablets.id=:id")
@NamedQuery(name = "updateOsByBrand", query = "update TabletsEntity tablets set tablets.os=:os where tablets.brand=:brand")
@NamedQuery(name = "updatePriceByOs",query = "update TabletsEntity tablets set tablets.price=:price where tablets.os=:os")
@ToString
@Table(name = "tablets")
public class TabletsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String description;
    private double price;
    private String brand;
    private String os;
}
