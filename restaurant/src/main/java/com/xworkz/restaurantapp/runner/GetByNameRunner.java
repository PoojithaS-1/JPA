package com.xworkz.restaurantapp.runner;

import com.xworkz.restaurantapp.entity.HotelEntity;

import javax.persistence.*;

public class GetByNameRunner {
    public static void main(String[] args) {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("poojitha");
        EntityManager em= emf.createEntityManager();
        Query getByName = em.createNamedQuery("getByName");
        getByName.setParameter("name","Mayura");
        try {
            HotelEntity hotelEntity=(HotelEntity) getByName.getSingleResult();
            System.out.println(hotelEntity);
        } catch (NoResultException e) {
            System.out.println(e.getMessage());
        }
    }
}
