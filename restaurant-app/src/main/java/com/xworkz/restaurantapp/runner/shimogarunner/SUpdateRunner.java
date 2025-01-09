package com.xworkz.restaurantapp.runner.shimogarunner;

import com.xworkz.restaurantapp.entity.ShimogaRestaurantEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SUpdateRunner {
    public static void main(String[] args) {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("poojitha");
        EntityManager em= emf.createEntityManager();
        EntityTransaction transaction= em.getTransaction();
        try {
            ShimogaRestaurantEntity shimogaRestaurantEntity=em.find(ShimogaRestaurantEntity.class,1);
            if(shimogaRestaurantEntity != null){
                shimogaRestaurantEntity.setAmenities("Home Delivery,Take Away,wifi");
                shimogaRestaurantEntity.setName("Empire");
                transaction.begin();
                em.merge(shimogaRestaurantEntity);
                transaction.commit();
                System.out.println("Data found and Successfully Updated...!");
            }else {
                System.out.println("Data not found");
            }
        } catch (Exception e) {
            transaction.rollback();
            System.out.println(e.getMessage());
        }
    }
}
