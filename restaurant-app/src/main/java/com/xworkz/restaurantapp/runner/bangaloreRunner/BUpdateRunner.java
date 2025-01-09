package com.xworkz.restaurantapp.runner.bangaloreRunner;

import com.xworkz.restaurantapp.entity.BangaloreRestaurantEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class BUpdateRunner {
    public static void main(String[] args) {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("poojitha");
        EntityManager em= emf.createEntityManager();
        EntityTransaction transaction= em.getTransaction();
        try {
            BangaloreRestaurantEntity bangaloreRestaurantEntity=em.find(BangaloreRestaurantEntity.class,3);
            if(bangaloreRestaurantEntity!=null){
                bangaloreRestaurantEntity.setRating(5.0);
                bangaloreRestaurantEntity.setAmenities("Take Away");
                transaction.begin();
                em.merge(bangaloreRestaurantEntity);
                transaction.commit();
                em.close();
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
