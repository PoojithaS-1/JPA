package com.xworkz.headsetsystem.repository;

import com.xworkz.headsetsystem.entity.HeadPhoneEntity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class HeadPhoneRepoImpl implements HeadPhoneRepo {

    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("poojitha");

    @Override
    public Boolean save(HeadPhoneEntity headPhoneEntity) {
        EntityManager entityManager = emf.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(headPhoneEntity);
        entityManager.getTransaction().commit();
        return true;
    }

    @Override
    public HeadPhoneEntity getById(Integer id) {
        EntityManager entityManager = emf.createEntityManager();
        return entityManager.find(HeadPhoneEntity.class, id);
    }

    @Override
    public HeadPhoneEntity getByName(String name) {
        EntityManager entityManager = emf.createEntityManager();
        Query getByName = entityManager.createNamedQuery("getByName");
        getByName.setParameter("name", name);
        try {
            HeadPhoneEntity singleResult = (HeadPhoneEntity) getByName.getSingleResult();
            return singleResult;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public int updateNameById(String name, Integer id) {
        EntityManager entityManager = emf.createEntityManager();
        try {
            entityManager.getTransaction().begin();
            Query updateQuery = entityManager.createNamedQuery("updateNameById");
            updateQuery.setParameter("name",name);
            updateQuery.setParameter("id", id);
            int rowsUpdated = updateQuery.executeUpdate();
            entityManager.getTransaction().commit();
            return rowsUpdated;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
return 0;
    }

    @Override
    public int updateDescriptionByid(String description, Integer id) {
        EntityManager entityManager= emf.createEntityManager();
        try {
            entityManager.getTransaction().begin();
            Query updateDescription =entityManager.createNamedQuery("updateDescriptionByid");
            updateDescription.setParameter("description",description);
            updateDescription.setParameter("id",id);
            int rows= updateDescription.executeUpdate();
            entityManager.getTransaction().commit();
            return rows;

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return 0;
    }

    @Override
    public int updateBrandByName(String brand, String name) {
        EntityManager entityManager= emf.createEntityManager();
        try {
            entityManager.getTransaction().begin();
            Query updateBrand=entityManager.createNamedQuery("updateBrandByName");
            updateBrand.setParameter("brand",brand);
            updateBrand.setParameter("name",name);
            int rows=updateBrand.executeUpdate();
            entityManager.getTransaction().commit();
            return rows;
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return 0;
    }
}