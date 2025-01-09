package com.xworkz.restaurantapp.runner.mangalorerunner;

import com.xworkz.restaurantapp.entity.MangaloreRestaurantEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MnglrRestaurantFindRunner {
    public static void main(String[] args) {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("poojitha");
        EntityManager em=emf.createEntityManager();
        MangaloreRestaurantEntity mangaloreRestaurantEntity=em.find(MangaloreRestaurantEntity.class,1);
        System.out.println(mangaloreRestaurantEntity);
    }
}
