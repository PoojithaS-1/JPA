package com.xworkz.restaurantapp.runner.davanagererunner;

import com.xworkz.restaurantapp.entity.DavanagereRestaurantEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DRestaurantFindRunner {
    public static void main(String[] args) {
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("poojitha");
        EntityManager em= emf.createEntityManager();
        DavanagereRestaurantEntity davanagereRestaurantEntity=em.find(DavanagereRestaurantEntity.class,3);
        System.out.println(davanagereRestaurantEntity);
    }
}
