package com.xworkz.restaurantapp.runner;

import com.xworkz.restaurantapp.entity.RestaurantEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class RestaurantRunner{
    public static void main(String[] args) {
        RestaurantEntity restaurantEntity=new RestaurantEntity();
        restaurantEntity.setId(2);
        restaurantEntity.setRName("Shanti Sagar");
        restaurantEntity.setRating(5.0);
        restaurantEntity.setLocation("Srinagar");
        restaurantEntity.setContact_No(8888543210l);
        restaurantEntity.setPincode(560061l);
        restaurantEntity.setRType("veg");
        EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("poojitha");
        EntityManager entityManager= entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(restaurantEntity);
        entityManager.getTransaction().commit();

    }
}
