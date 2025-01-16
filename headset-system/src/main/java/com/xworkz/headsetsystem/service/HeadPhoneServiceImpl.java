package com.xworkz.headsetsystem.service;

import com.xworkz.headsetsystem.entity.HeadPhoneEntity;
import com.xworkz.headsetsystem.repository.HeadPhoneRepo;
import com.xworkz.headsetsystem.repository.HeadPhoneRepoImpl;

public class HeadPhoneServiceImpl implements HeadPhoneService {

    private static HeadPhoneRepo headPhoneRepo = new HeadPhoneRepoImpl();

    @Override
    public void save(HeadPhoneEntity headPhoneEntity) {
        Boolean save = headPhoneRepo.save(headPhoneEntity);
        if (save) {
            System.out.println("Data saved successfully");
        } else {
            System.out.println("Data not saved successfully");
        }
    }

    @Override
    public HeadPhoneEntity getById(Integer id) {
        HeadPhoneEntity headPhone = headPhoneRepo.getById(id);
        if (headPhone != null) {
            System.out.println("Headphone id found\n" + headPhone);
        }
        else {
            System.out.println("Headphone id not found");
        }
        return headPhone;
    }

    @Override
    public HeadPhoneEntity getByName(String name) {
        HeadPhoneEntity headPhone = headPhoneRepo.getByName(name);
        if (headPhone != null){
            System.out.println("Headphone "+name+ " found\n" + headPhone);
        }
        else {
            System.out.println("No Headphone found with the name: " + name);
        }
        return headPhone;
    }

    @Override
    public int updateNameById(String name,Integer id) {
        int row= headPhoneRepo.updateNameById(name, id);
        if (row>0) {
            System.out.println("HeadPhone name updated successfully");
        } else {
            System.out.println("Failed to update HeadPhone");
        }
        return 0;
    }

    @Override
    public int updateDescriptionByid(String description, Integer id) {
        int row=headPhoneRepo.updateDescriptionByid(description,id);
        if (row>0) {
            System.out.println("HeadPhone description updated successfully");
        } else {
            System.out.println("Failed to update HeadPhone description");
        }
        return 0;
    }

    @Override
    public int updateBrandByName(String brand, String name) {
        int row=headPhoneRepo.updateBrandByName(brand,name);
        if (row>0) {
            System.out.println("HeadPhone brand updated successfully");
        } else {
            System.out.println("Failed to update HeadPhone brand");
        }
        return 0;

    }


}
