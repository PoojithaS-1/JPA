package com.xworkz.restaurantapp.runner.bangaloreRunner;

import com.xworkz.restaurantapp.entity.BangaloreRestaurantEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class BRestaurantFindRunner {
    public static void main(String[] args) {
       EntityManagerFactory emf= Persistence.createEntityManagerFactory("poojitha");
       EntityManager em=emf.createEntityManager();
       BangaloreRestaurantEntity bangaloreRestaurantEntity=em.find(BangaloreRestaurantEntity.class,4);
       System.out.println(bangaloreRestaurantEntity);

    }
}
