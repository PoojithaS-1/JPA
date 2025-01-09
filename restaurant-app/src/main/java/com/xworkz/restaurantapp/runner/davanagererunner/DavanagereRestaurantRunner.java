package com.xworkz.restaurantapp.runner.davanagererunner;

import com.xworkz.restaurantapp.entity.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

    public class DavanagereRestaurantRunner {
    public static void main(String[] args) {
        DavanagereRestaurantEntity davanagereRestaurantEntity =new DavanagereRestaurantEntity();
        davanagereRestaurantEntity.setId(7);
        davanagereRestaurantEntity.setName("Restaurant Davangere Donne Biryani");
        davanagereRestaurantEntity.setLocation("Davanagere");
        davanagereRestaurantEntity.setRating(4.5);
        davanagereRestaurantEntity.setPrice(300.0);
        davanagereRestaurantEntity.setAmenities("Home Delivery,Take Away,Pure Veg");
        davanagereRestaurantEntity.setCuisine("South Indian,Chinese");
        davanagereRestaurantEntity.setContactNo(9876543222l);

        EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("poojitha");
        EntityManager entityManager=entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(davanagereRestaurantEntity);
        entityManager.getTransaction().commit();
    }
}
