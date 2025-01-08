package com.xworkz.restaurantapp.runner;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class RestaurantRunner{
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("poojitha");
    }
}
