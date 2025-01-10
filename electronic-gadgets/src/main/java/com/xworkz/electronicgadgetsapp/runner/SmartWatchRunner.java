package com.xworkz.electronicgadgetsapp.runner;

import com.xworkz.electronicgadgetsapp.entity.SmartWatchEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class SmartWatchRunner {
    public static void main(String[] args) {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("poojitha");
        EntityManager em=emf.createEntityManager();
        List<SmartWatchEntity> smartWatches=new ArrayList<>();
        smartWatches.add(new SmartWatchEntity(null,"Apple Watch Series 7", "High-end smartwatch with great display", 399.99, "Apple", "iOS"));
        smartWatches.add(new SmartWatchEntity(null,"Samsung Galaxy Watch3", "Android smartwatch with great design", 299.99, "Samsung", "Android"));
        smartWatches.add(new SmartWatchEntity(null,"Fitbit Versa 3", "Fitness-focused smartwatch with great design", 229.99, "Fitbit", "Android, iOS"));
        smartWatches.add(new SmartWatchEntity(null,"Huawei Watch GT 2", "Budget-friendly smartwatch with great battery life", 199.99, "Huawei", "Android, iOS"));
        smartWatches.add(new SmartWatchEntity(null,"Google Wear OS Smartwatch", "Smartwatch with great integration with Google services", 299.99, "Google", "Android"));
        em.getTransaction().begin();
        for (SmartWatchEntity smartWatch:smartWatches){
            em.persist(smartWatch);
        }
        em.getTransaction().commit();

    }
}
