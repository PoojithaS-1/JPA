package com.xworkz.restaurantapp.runner;

import com.xworkz.restaurantapp.entity.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class RestaurantRunner {
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

        DavanagereRestaurantEntity davanagereRestaurantEntity =new DavanagereRestaurantEntity();
        davanagereRestaurantEntity.setId(7);
        davanagereRestaurantEntity.setName("Restaurant Davangere Donne Biryani");
        davanagereRestaurantEntity.setLocation("Davanagere");
        davanagereRestaurantEntity.setRating(4.5);
        davanagereRestaurantEntity.setPrice(300.0);
        davanagereRestaurantEntity.setAmenities("Home Delivery,Take Away,Pure Veg");
        davanagereRestaurantEntity.setCuisine("South Indian,Chinese");
        davanagereRestaurantEntity.setContactNo(9876543222l);

        BangaloreRestaurantEntity bangaloreRestaurantEntity=new BangaloreRestaurantEntity();
        bangaloreRestaurantEntity.setId(7);
        bangaloreRestaurantEntity.setName("Restaurant Davangere Donne Biryani");
        bangaloreRestaurantEntity.setLocation("Electronic City,Bangalore");
        bangaloreRestaurantEntity.setRating(4.5);
        bangaloreRestaurantEntity.setPrice(300.0);
        bangaloreRestaurantEntity.setAmenities("Home Delivery,Take Away,Pure Veg");
        bangaloreRestaurantEntity.setCuisine("South Indian,Chinese");
        bangaloreRestaurantEntity.setContactNo(9876543228l);

        MangaloreRestaurantEntity mangaloreRestaurantEntity=new MangaloreRestaurantEntity();
        mangaloreRestaurantEntity.setId(7);
        mangaloreRestaurantEntity.setName("Restaurant Navaratna");
        mangaloreRestaurantEntity.setLocation("Kodialbail,Mangalore");
        mangaloreRestaurantEntity.setRating(4.2);
        mangaloreRestaurantEntity.setPrice(250.0);
        mangaloreRestaurantEntity.setAmenities("Home Delivery,Take Away,Wi-Fi");
        mangaloreRestaurantEntity.setCuisine("South Indian,North Indian");
        mangaloreRestaurantEntity.setContactNo(9876543235l);

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
//        entityManager.persist(shimogaRestaurantEntity);
//        entityManager.persist(davanagereRestaurantEntity);
//        entityManager.persist(bangaloreRestaurantEntity);
//        entityManager.persist(mangaloreRestaurantEntity);
        entityManager.persist(mysoreRestaurantEntity);
        entityManager.getTransaction().commit();
    }
}
