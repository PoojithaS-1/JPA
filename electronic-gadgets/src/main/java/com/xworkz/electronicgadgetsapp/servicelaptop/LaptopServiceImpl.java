package com.xworkz.electronicgadgetsapp.servicelaptop;

import com.xworkz.electronicgadgetsapp.repositorylaptop.LaptopRepo;
import com.xworkz.electronicgadgetsapp.repositorylaptop.LaptopRepoImpl;

public class LaptopServiceImpl implements LaptopService{
    private static LaptopRepo laptopRepo=new LaptopRepoImpl();
    @Override
    public int updateNameById(String name, Integer laptopId) {
        int row=laptopRepo.updateNameById(name, laptopId);
        if (row>0){
            System.out.println("Laptop Name updated successfully");
        }else {
            System.out.println("Laptop Name not Updated. Id not found");
        }
        return 0;
    }

    @Override
    public int updateBrandById(String brand, Integer laptopId) {
        int row=laptopRepo.updateBrandById(brand, laptopId);
        if (row>0){
            System.out.println("Laptop brand updated successfully");
        }else {
            System.out.println("Laptop brand not Updated. Id not found");
        }
        return 0;
    }

    @Override
    public int updatePriceByBrand(Double price, String brand) {
        int row=laptopRepo.updatePriceByBrand(price, brand);
        if (row>0){
            System.out.println("Laptop price updated successfully");
        }else {
            System.out.println("Laptop price not Updated. Id not found");
        }
        return 0;
    }
}
