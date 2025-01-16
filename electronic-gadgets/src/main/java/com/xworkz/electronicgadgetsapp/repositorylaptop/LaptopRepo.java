package com.xworkz.electronicgadgetsapp.repositorylaptop;

public interface LaptopRepo {

    int updateNameById(String name,Integer laptopId);

    int updateBrandById(String brand,Integer laptopId);

    int updatePriceByBrand(Double price,String brand);


}
