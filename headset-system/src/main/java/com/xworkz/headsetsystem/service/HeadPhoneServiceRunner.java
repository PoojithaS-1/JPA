package com.xworkz.headsetsystem.service;

import com.xworkz.headsetsystem.entity.HeadPhoneEntity;

public class HeadPhoneServiceRunner {

    public static void main(String[] args) {
        HeadPhoneService headPhoneService = new HeadPhoneServiceImpl();
//        HeadPhoneEntity headPhoneEntity = new HeadPhoneEntity(null, "Audio-Technica ATH-M50x", "Wired headphones,sound quality,comfort", 169.99 , "Audio-Technica","45mm");
//        headPhoneService.save(headPhoneEntity);
        headPhoneService.getById(5);

        headPhoneService.getByName("Beats Solo Pro");

        HeadPhoneEntity headPhoneEntity = headPhoneService.getById(1);

        headPhoneService.updateNameById("Mivi",2);

        headPhoneService.updateDescriptionByid("Good quality",4);

        headPhoneService.updateBrandByName("Techfire","Mivi");

    }
}
