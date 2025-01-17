package com.xworkz.restaurantapp.runner;

import com.xworkz.restaurantapp.entity.RestaurantEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FindRunner {
    public static void main(String[] args) {
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("poojitha");
        EntityManager em=emf.createEntityManager();
        RestaurantEntity restaurantEntity=em.find(RestaurantEntity.class,2);
        System.out.println(restaurantEntity);
    }
}
