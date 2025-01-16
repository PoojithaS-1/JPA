package com.xworkz.electronicgadgetsapp.servicetablets;

import com.xworkz.electronicgadgetsapp.repositorytablets.TabletsRepo;
import com.xworkz.electronicgadgetsapp.repositorytablets.TabletsRepoImpl;

public class TabletsServiceImpl implements TabletsService{
    private static TabletsRepo tabletsRepo=new TabletsRepoImpl();


    @Override
    public int updateDescriptionByid(String description, Integer id) {
        int row=tabletsRepo.updateDescriptionByid(description, id);
        if (row>0){
            System.out.println("Tablets description updated successfully");
        }else {
            System.out.println("Tablets description not updated successfully");
        }
        return 0;
    }

    @Override
    public int updateOsByBrand(String os, String brand) {
        int row=tabletsRepo.updateOsByBrand(os, brand);
        if (row>0){
            System.out.println("Tablets Operating system updated successfully");
        }else {
            System.out.println("Tablets Operating system not updated successfully");
        }
        return 0;
    }

    @Override
    public int updatePriceByOs(Double price, String os) {
        int row=tabletsRepo.updatePriceByOs(price, os);
        if (row>0){
            System.out.println("Tablets price updated successfully");
        }else {
            System.out.println("Tablets price not updated successfully");
        }
        return 0;
    }
}
