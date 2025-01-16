package com.xworkz.electronicgadgetsapp.servicelaptop;

public interface LaptopService {
    int updateNameById(String name,Integer laptopId);

    int updateBrandById(String brand,Integer laptopId);

    int updatePriceByBrand(Double price,String brand);
}
