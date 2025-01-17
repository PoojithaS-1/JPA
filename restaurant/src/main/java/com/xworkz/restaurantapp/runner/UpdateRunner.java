package com.xworkz.restaurantapp.runner;

import com.xworkz.restaurantapp.entity.RestaurantEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateRunner {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("poojitha");
        EntityManager entityManager=entityManagerFactory.createEntityManager();
        EntityTransaction transaction=entityManager.getTransaction();
        try {
            RestaurantEntity restaurantEntity=entityManager.find(RestaurantEntity.class,1);
            if (restaurantEntity !=null){
                restaurantEntity.setRName("Empire");
                restaurantEntity.setLocation("Srinagar");
                transaction.begin();
                entityManager.merge(restaurantEntity);
                transaction.commit();
                entityManager.close();
                System.out.println("Data found");
        }else {
                System.out.println("Data not found");
            }
        }catch (Exception e){
            transaction.rollback();
            System.out.println(e.getMessage());
        }


    }
}
