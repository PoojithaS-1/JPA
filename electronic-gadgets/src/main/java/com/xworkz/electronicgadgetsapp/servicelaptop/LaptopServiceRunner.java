package com.xworkz.electronicgadgetsapp.servicelaptop;

public class LaptopServiceRunner {
    static LaptopService laptopService=new LaptopServiceImpl();
    public static void main(String[] args) {
        laptopService.updateNameById("Lenovo Thinkpad",4);
        laptopService.updateBrandById("HP",5);
        laptopService.updatePriceByBrand(500000.0,"Apple");
    }
}
