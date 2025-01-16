package com.xworkz.electronicgadgetsapp.repositorytablets;

public interface TabletsRepo {

    int updateDescriptionByid(String description,Integer id);

    int updateOsByBrand(String os,String brand);

    int updatePriceByOs(Double price,String os);
}
