package com.xworkz.restaurantapp.runner.mysorerunner;

import com.xworkz.restaurantapp.entity.MysoreRestaurantEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MysrUpdateRunner {
    public static void main(String[] args) {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("poojitha");
        EntityManager em= emf.createEntityManager();
        EntityTransaction transaction= em.getTransaction();
        try {
            MysoreRestaurantEntity mysoreRestaurantEntity=em.find(MysoreRestaurantEntity.class,4);
            if (mysoreRestaurantEntity != null){
                mysoreRestaurantEntity.setContactNo(9876543210l);
                mysoreRestaurantEntity.setRating(5.0);
                transaction.begin();
                em.merge(mysoreRestaurantEntity);
                transaction.commit();
                em.close();
                System.out.println("Data found and Updated Successfully...!");
            }else {
                System.out.println("Data not found");
            }
        } catch (Exception e) {
            transaction.rollback();
            System.out.println(e.getMessage());
        }
    }
}
