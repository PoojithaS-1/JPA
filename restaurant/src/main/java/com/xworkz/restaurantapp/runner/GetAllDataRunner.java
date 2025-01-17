package com.xworkz.restaurantapp.runner;

import com.xworkz.restaurantapp.entity.HotelEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

public class GetAllDataRunner {
    public static void main(String[] args) {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("poojitha");
        EntityManager em=emf.createEntityManager();
        Query getAllData=em.createNamedQuery("getAllData");
        List<HotelEntity> resultList=(List<HotelEntity>)  getAllData.getResultList();
        for (HotelEntity hotel:resultList){
            System.out.println(hotel);
        }
    }
}
