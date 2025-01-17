package com.xworkz.restaurantapp.runner;

import com.xworkz.restaurantapp.entity.HotelEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AutoTableCreateRunner {
    public static void main(String[] args) {
        HotelEntity hotelEntity=new HotelEntity(null,"Mayura",true,"vijayanagar","Karnataka");
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("poojitha");
        EntityManager em=emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(hotelEntity);
        em.getTransaction().commit();
    }
}
