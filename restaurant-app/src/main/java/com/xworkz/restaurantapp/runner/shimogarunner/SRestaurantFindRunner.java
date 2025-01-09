package com.xworkz.restaurantapp.runner.shimogarunner;

import com.xworkz.restaurantapp.entity.ShimogaRestaurantEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class SRestaurantFindRunner {
    public static void main(String[] args) {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("poojitha");
        EntityManager em=emf.createEntityManager();
        ShimogaRestaurantEntity shimogaRestaurantEntity=em.find(ShimogaRestaurantEntity.class,2);
        System.out.println(shimogaRestaurantEntity);
    }
}
