package com.xworkz.restaurantapp.runner.shimogarunner;

import com.xworkz.restaurantapp.entity.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ShimogaRestaurantRunner {
    public static void main(String[] args) {
        ShimogaRestaurantEntity shimogaRestaurantEntity=new ShimogaRestaurantEntity();
        shimogaRestaurantEntity.setId(7);
        shimogaRestaurantEntity.setName("Restaurant Davangere Benne Dosa");
        shimogaRestaurantEntity.setLocation("Shimoga");
        shimogaRestaurantEntity.setRating(3.5);
        shimogaRestaurantEntity.setPrice(220.0);
        shimogaRestaurantEntity.setAmenities("Home Delivery,Take Away,Pure Veg");
        shimogaRestaurantEntity.setCuisine("South Indian,Chinese");
        shimogaRestaurantEntity.setContactNo(9876543216l);



        EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("poojitha");
        EntityManager entityManager=entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(shimogaRestaurantEntity);
        entityManager.getTransaction().commit();
    }
}
