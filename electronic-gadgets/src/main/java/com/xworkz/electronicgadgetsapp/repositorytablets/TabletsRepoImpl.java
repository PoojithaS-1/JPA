package com.xworkz.electronicgadgetsapp.repositorytablets;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class TabletsRepoImpl implements TabletsRepo{
    private EntityManagerFactory emf= Persistence.createEntityManagerFactory("poojitha");


    @Override
    public int updateDescriptionByid(String description, Integer id) {
        EntityManager entityManager=emf.createEntityManager();
        try {
            entityManager.getTransaction().begin();
            Query updateDescription =entityManager.createNamedQuery("updateDescriptionByid");
            updateDescription.setParameter("description",description);
            updateDescription.setParameter("id",id);
            int row= updateDescription.executeUpdate();
            entityManager.getTransaction().commit();
            return row;
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return 0;
    }

    @Override
    public int updateOsByBrand(String os, String brand) {
        EntityManager entityManager=emf.createEntityManager();
        try {
            entityManager.getTransaction().begin();
            Query updateOs =entityManager.createNamedQuery("updateOsByBrand");
            updateOs.setParameter("os",os);
            updateOs.setParameter("brand",brand);
            int row= updateOs.executeUpdate();
            entityManager.getTransaction().commit();
            return row;
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return 0;
    }

    @Override
    public int updatePriceByOs(Double price, String os) {
        EntityManager entityManager=emf.createEntityManager();
        try {
            entityManager.getTransaction().begin();
            Query updatePrice =entityManager.createNamedQuery("updatePriceByOs");
            updatePrice.setParameter("price",price);
            updatePrice.setParameter("os",os);
            int row= updatePrice.executeUpdate();
            entityManager.getTransaction().commit();
            return row;
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return 0;
    }
}
