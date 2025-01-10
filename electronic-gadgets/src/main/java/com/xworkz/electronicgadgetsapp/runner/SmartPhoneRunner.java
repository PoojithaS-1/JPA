package com.xworkz.electronicgadgetsapp.runner;

import com.xworkz.electronicgadgetsapp.entity.SmartPhoneEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class SmartPhoneRunner {
    public static void main(String[] args) {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("poojitha");
        EntityManager em=emf.createEntityManager();
        List<SmartPhoneEntity> smartPhoneEntities=new ArrayList<>();
        smartPhoneEntities.add(new SmartPhoneEntity(null , "iPhone 14", "Latest iPhone model ", 999.99 , "Apple", "iOS" ));
        smartPhoneEntities.add(new SmartPhoneEntity(null , "Samsung Galaxy S22", "High-end Android smartphone", 899.99 , "Samsung", "Android" ));
        smartPhoneEntities.add(new SmartPhoneEntity(null , "Google Pixel 6", "Android smartphone with great camera", 699.99 , "Google", "Android" ));
        smartPhoneEntities.add(new SmartPhoneEntity(null, "OnePlus 9 Pro", "Fast charging and large display", 799.99 , "OnePlus", "Android" ));
        smartPhoneEntities.add(new SmartPhoneEntity(null, "Huawei P40 Pro", "High-end smartphone with great camera", 899.99 , "Huawei", "Android" ));
        em.getTransaction().begin();
        for (SmartPhoneEntity smartPhone:smartPhoneEntities)
        em.persist(smartPhone);
        em.getTransaction().commit();

    }
}
