package com.xworkz.electronicgadgetsapp.repositorylaptop;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class LaptopRepoImpl implements LaptopRepo{
    private EntityManagerFactory emf= Persistence.createEntityManagerFactory("poojitha");
    @Override
    public int updateNameById(String name, Integer laptopId) {
        EntityManager entityManager= emf.createEntityManager();
        try {
            entityManager.getTransaction().begin();
            Query updateName=entityManager.createNamedQuery("updateNameById");
            updateName.setParameter("name",name);
            updateName.setParameter("laptopId",laptopId);
            int rows=updateName.executeUpdate();
            entityManager.getTransaction().commit();
            return rows;
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return 0;
    }

    @Override
    public int updateBrandById(String brand, Integer laptopId) {
        EntityManager entityManager= emf.createEntityManager();
        try {
            entityManager.getTransaction().begin();
            Query updateBrand =entityManager.createNamedQuery("updateBrandById");
            updateBrand.setParameter("brand",brand);
            updateBrand.setParameter("laptopId",laptopId);
            int rows= updateBrand.executeUpdate();
            entityManager.getTransaction().commit();
            return rows;
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return 0;
    }

    @Override
    public int updatePriceByBrand(Double price, String brand) {
        EntityManager entityManager= emf.createEntityManager();
        try {
            entityManager.getTransaction().begin();
            Query updatePrice =entityManager.createNamedQuery("updatePriceByBrand");
            updatePrice.setParameter("price",price);
            updatePrice.setParameter("brand",brand);
            int rows= updatePrice.executeUpdate();
            entityManager.getTransaction().commit();
            return rows;
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return 0;
    }
}
