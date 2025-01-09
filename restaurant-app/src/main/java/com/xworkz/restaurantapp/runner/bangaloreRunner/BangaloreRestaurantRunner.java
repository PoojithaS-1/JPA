package com.xworkz.restaurantapp.runner.bangaloreRunner;

import com.xworkz.restaurantapp.entity.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class BangaloreRestaurantRunner {
    public static void main(String[] args) {

        BangaloreRestaurantEntity bangaloreRestaurantEntity=new BangaloreRestaurantEntity();
        bangaloreRestaurantEntity.setId(7);
        bangaloreRestaurantEntity.setName("Restaurant Davangere Donne Biryani");
        bangaloreRestaurantEntity.setLocation("Electronic City,Bangalore");
        bangaloreRestaurantEntity.setRating(4.5);
        bangaloreRestaurantEntity.setPrice(300.0);
        bangaloreRestaurantEntity.setAmenities("Home Delivery,Take Away,Pure Veg");
        bangaloreRestaurantEntity.setCuisine("South Indian,Chinese");
        bangaloreRestaurantEntity.setContactNo(9876543228l);

        EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("poojitha");
        EntityManager entityManager=entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(bangaloreRestaurantEntity);
        entityManager.getTransaction().commit();
    }
}
