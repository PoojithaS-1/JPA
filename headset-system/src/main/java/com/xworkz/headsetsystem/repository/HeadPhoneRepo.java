package com.xworkz.headsetsystem.repository;

import com.xworkz.headsetsystem.entity.HeadPhoneEntity;

public interface HeadPhoneRepo {

    Boolean save(HeadPhoneEntity headPhoneEntity);

    HeadPhoneEntity getById(Integer id);

    HeadPhoneEntity getByName(String name);

    int updateNameById(String name,Integer id);

    int updateDescriptionByid(String description,Integer id);

    int updateBrandByName(String brand,String name);


}