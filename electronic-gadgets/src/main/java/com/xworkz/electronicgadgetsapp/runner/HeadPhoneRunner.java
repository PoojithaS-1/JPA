package com.xworkz.electronicgadgetsapp.runner;

import com.xworkz.electronicgadgetsapp.entity.HeadPhoneEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class HeadPhoneRunner {
    public static void main(String[] args) {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("poojitha");
        EntityManager em= emf.createEntityManager();
        List<HeadPhoneEntity> headPhoneEntities=new ArrayList<>();
        headPhoneEntities.add(new HeadPhoneEntity(null,"Sony WH-1000XM4", "High-end wireless headphones with great noise cancellation", 349.99 , "Sony","40mm"));
        headPhoneEntities.add(new HeadPhoneEntity(null,"Bose QuietComfort 35", "Wireless headphones with advanced noise cancellation", 299.99 , "Bose","40mm"));
        headPhoneEntities.add(new HeadPhoneEntity(null,"Sennheiser HD 4.50 BT", "Wireless headphones with great sound quality", 199.99 , "Sennheiser","40mm"));
        headPhoneEntities.add(new HeadPhoneEntity(null,"Beats Solo Pro", "Wireless headphones with great sound and long battery life", 299.99 , "Beats","40mm"));
        headPhoneEntities.add(new HeadPhoneEntity(null,"Audio-Technica ATH-M50x", "Wired headphones with great sound quality and comfort", 169.99 , "Audio-Technica","45mm"));

        em.getTransaction().begin();
        for (HeadPhoneEntity headPhone:headPhoneEntities){
            em.persist(headPhone);
        }
        em.getTransaction().commit();
    }
}
