package com.xworkz.restaurantapp.runner.mysorerunner;

import com.xworkz.restaurantapp.entity.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MysoreRestaurantRunner {
    public static void main(String[] args) {

        MysoreRestaurantEntity mysoreRestaurantEntity=new MysoreRestaurantEntity();
        mysoreRestaurantEntity.setId(7);
        mysoreRestaurantEntity.setName("Restaurant Gayathri Tiffin Room");
        mysoreRestaurantEntity.setLocation("Chamundi Hills,Mysore");
        mysoreRestaurantEntity.setRating(4.2);
        mysoreRestaurantEntity.setPrice(250.0);
        mysoreRestaurantEntity.setAmenities("Home Delivery,Take Away,Wi-Fi");
        mysoreRestaurantEntity.setCuisine("South Indian,North Indian");
        mysoreRestaurantEntity.setContactNo(9876543242l);

        EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("poojitha");
        EntityManager entityManager=entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(mysoreRestaurantEntity);
        entityManager.getTransaction().commit();
    }
}
