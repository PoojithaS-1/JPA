package com.xworkz.restaurantapp.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class CountRunner {
    public static void main(String[] args) {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("poojitha");
        EntityManager em=emf.createEntityManager();
        Query count=em.createNamedQuery("count");
        count.setParameter("state","karnataka");
        Long list=(Long) count.getSingleResult();
        System.out.println(list);
    }
}
