package com.xworkz.electronicgadgetsapp.servicetablets;

public interface TabletsService {

    int updateDescriptionByid(String description,Integer id);

    int updateOsByBrand(String os,String brand);

    int updatePriceByOs(Double price,String os);
}
