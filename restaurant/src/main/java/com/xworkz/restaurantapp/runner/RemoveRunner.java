package com.xworkz.restaurantapp.runner;

import com.xworkz.restaurantapp.entity.HotelEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class RemoveRunner {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("poojitha");
        EntityManager em = emf.createEntityManager();
        HotelEntity hotelEntity = em.find(HotelEntity.class, 2);
        em.getTransaction().begin();
        em.remove(hotelEntity);
        em.getTransaction().commit();
    }
}
