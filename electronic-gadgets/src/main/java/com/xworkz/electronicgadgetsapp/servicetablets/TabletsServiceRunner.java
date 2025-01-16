package com.xworkz.electronicgadgetsapp.servicetablets;

public class TabletsServiceRunner {

    public static void main(String[] args) {
        TabletsService tabletsService=new TabletsServiceImpl();
        tabletsService.updateDescriptionByid("Good Product",5);
        tabletsService.updateOsByBrand("MacOs","Apple");
        tabletsService.updatePriceByOs(400000.0,"Windows");
    }
}
