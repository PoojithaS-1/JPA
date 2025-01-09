package com.xworkz.restaurantapp.runner.davanagererunner;

import com.xworkz.restaurantapp.entity.DavanagereRestaurantEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DUpdateRunner {
    public static void main(String[] args) {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("poojitha");
        EntityManager em=emf.createEntityManager();
        EntityTransaction transaction= em.getTransaction();
        try {
            DavanagereRestaurantEntity davanagereRestaurantEntity=em.find(DavanagereRestaurantEntity.class,5);
            if (davanagereRestaurantEntity !=null){
                davanagereRestaurantEntity.setPrice(222.00);
                davanagereRestaurantEntity.setCuisine("South-Indian");
                transaction.begin();
                em.merge(davanagereRestaurantEntity);
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
