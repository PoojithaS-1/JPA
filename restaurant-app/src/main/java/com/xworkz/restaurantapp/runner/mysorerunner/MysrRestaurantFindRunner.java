package com.xworkz.restaurantapp.runner.mysorerunner;

import com.xworkz.restaurantapp.entity.MysoreRestaurantEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MysrRestaurantFindRunner {
    public static void main(String[] args) {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("poojitha");
        EntityManager em=emf.createEntityManager();
        MysoreRestaurantEntity mysoreRestaurantEntity=em.find(MysoreRestaurantEntity.class,7);
        System.out.println(mysoreRestaurantEntity);
    }
}
