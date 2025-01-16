package com.xworkz.electronicgadgetsapp.runner;

import com.xworkz.electronicgadgetsapp.entitytablets.TabletsEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class TabletsRunner {
    public static void main(String[] args) {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("poojitha");
        EntityManager em= emf.createEntityManager();
        List<TabletsEntity> tabletsEntities=new ArrayList<>();
        tabletsEntities.add(new TabletsEntity(null,"Apple iPad Pro","High-end tablet with great display", 899.99, "Apple", "iOS" ));
        tabletsEntities.add(new TabletsEntity(null,"Samsung Galaxy Tab S8","Android tablet with great design", 649.99, "Samsung", "Android"));
        tabletsEntities.add(new TabletsEntity(null,"Amazon Fire HD 10","Budget-friendly tablet with great value", 149.99, "Amazon", "Fire OS"));
        tabletsEntities.add(new TabletsEntity(null,"Microsoft Surface Go","Windows tablet with great productivity features", 399.99, "Microsoft", "Windows"));
        tabletsEntities.add(new TabletsEntity(null,"Lenovo Tab P11 Pro","Android tablet with great performance", 499.99, "Lenovo", "Android"));

        em.getTransaction().begin();
        for (TabletsEntity tablets:tabletsEntities){
            em.persist(tablets);
        }
        em.getTransaction().commit();
    }
}
