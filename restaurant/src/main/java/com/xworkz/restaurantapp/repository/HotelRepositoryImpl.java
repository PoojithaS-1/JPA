package com.xworkz.restaurantapp.repository;

import com.xworkz.restaurantapp.entity.HotelEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class HotelRepositoryImpl implements HotelRepository {
private EntityManagerFactory emf= Persistence.createEntityManagerFactory("poojitha");
    @Override
    public Boolean save(HotelEntity hotelEntity) {
        EntityManager entityManager=emf.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(hotelEntity);
        entityManager.getTransaction().commit();

        return true;
    }

    @Override
    public HotelEntity getById(Integer id) {
        EntityManager entityManager=emf.createEntityManager();
        return entityManager.find(HotelEntity.class,id);
    }

    @Override
    public HotelEntity getByName(String hotelName) {
        EntityManager entityManager=emf.createEntityManager();
        Query getByName=entityManager.createNamedQuery("getByName");
        getByName.setParameter("hotelName", hotelName);
        try {
            HotelEntity singleResult=(HotelEntity) getByName.getSingleResult();
            return singleResult;

        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        return null;
    }

    @Override
    public int updateByName(String location,String hotelName) {
        EntityManager entityManager= emf.createEntityManager();
        try {
            entityManager.getTransaction().begin();
            Query updateByName=entityManager.createNamedQuery("updateByName");
            updateByName.setParameter("location",location);
            updateByName.setParameter("hotelName",hotelName);
            int row=updateByName.executeUpdate();
            entityManager.getTransaction().commit();
            return row;
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }return 0;
    }

    @Override
    public String getLocationById(Integer id) {
        EntityManager entityManager= emf.createEntityManager();
        try {
            Query getLocation=entityManager.createNamedQuery("getLocationById");
            getLocation.setParameter("id",id);
            String location=(String)getLocation.getSingleResult();
            return location;
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public HotelEntity getLocationAndStateById(Integer id) {
        EntityManager entityManager= emf.createEntityManager();
        try {
            Query getLocationAndState =entityManager.createNamedQuery("getLocationAndStateById");
            getLocationAndState.setParameter("id",id);
            HotelEntity locationAndState=(HotelEntity) getLocationAndState.getSingleResult();
            return locationAndState;
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public Integer getIdByLocation(String location) {
        EntityManager entityManager= emf.createEntityManager();
        try {
            Query getId=entityManager.createNamedQuery("getIdByLocation");
            getId.setParameter("location",location);
            Integer id=(Integer) getId.getSingleResult();
            return id;
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return 0;
    }

    @Override
    public String getLocationByName(String hotelName) {
        EntityManager entityManager=emf.createEntityManager();
        try {
            Query getLocation=entityManager.createNamedQuery("getLocationByName");
            getLocation.setParameter("hotelName",hotelName);
            String location = (String) getLocation.getSingleResult();
            return location;
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public HotelEntity getLocationAndStateByName(String hotelName) {
        EntityManager entityManager=emf.createEntityManager();
        try {
            Query getLocationAndState =entityManager.createNamedQuery("getLocationAndStateByName");
            getLocationAndState.setParameter("hotelName",hotelName);
            HotelEntity locationAndState = (HotelEntity) getLocationAndState.getSingleResult();
            return locationAndState;
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public HotelEntity getLocationNameAndStateById(Integer id) {
        EntityManager entityManager=emf.createEntityManager();
        try {
            Query getLocationNameAndState =entityManager.createNamedQuery("getLocationNameAndStateById");
            getLocationNameAndState.setParameter("id",id);
            HotelEntity locationNameAndState = (HotelEntity) getLocationNameAndState.getSingleResult();
            return locationNameAndState;
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return null;
    }


}
