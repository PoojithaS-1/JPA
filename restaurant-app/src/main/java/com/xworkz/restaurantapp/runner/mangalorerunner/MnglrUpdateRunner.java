package com.xworkz.restaurantapp.runner.mangalorerunner;

import com.xworkz.restaurantapp.entity.MangaloreRestaurantEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MnglrUpdateRunner {
    public static void main(String[] args) {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("poojitha");
        EntityManager em=emf.createEntityManager();
        EntityTransaction transaction= em.getTransaction();
        try {
            MangaloreRestaurantEntity mangaloreRestaurantEntity=em.find(MangaloreRestaurantEntity.class,5);
            if (mangaloreRestaurantEntity != null){
                mangaloreRestaurantEntity.setRating(5.0);
                mangaloreRestaurantEntity.setPrice(500.0);
                transaction.begin();
                em.merge(mangaloreRestaurantEntity);
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
