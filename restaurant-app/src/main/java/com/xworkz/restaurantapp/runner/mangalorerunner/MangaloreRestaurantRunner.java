package com.xworkz.restaurantapp.runner.mangalorerunner;

import com.xworkz.restaurantapp.entity.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MangaloreRestaurantRunner {
    public static void main(String[] args) {

        MangaloreRestaurantEntity mangaloreRestaurantEntity=new MangaloreRestaurantEntity();
        mangaloreRestaurantEntity.setId(7);
        mangaloreRestaurantEntity.setName("Restaurant Navaratna");
        mangaloreRestaurantEntity.setLocation("Kodialbail,Mangalore");
        mangaloreRestaurantEntity.setRating(4.2);
        mangaloreRestaurantEntity.setPrice(250.0);
        mangaloreRestaurantEntity.setAmenities("Home Delivery,Take Away,Wi-Fi");
        mangaloreRestaurantEntity.setCuisine("South Indian,North Indian");
        mangaloreRestaurantEntity.setContactNo(9876543235l);

        EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("poojitha");
        EntityManager entityManager=entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();

        entityManager.persist(mangaloreRestaurantEntity);

        entityManager.getTransaction().commit();
    }
}

