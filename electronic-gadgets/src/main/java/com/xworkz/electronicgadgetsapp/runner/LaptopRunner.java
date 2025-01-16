package com.xworkz.electronicgadgetsapp.runner;

import com.xworkz.electronicgadgetsapp.entitylaptop.LaptopEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class LaptopRunner {
    public static void main(String[] args) {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("poojitha");
        EntityManager em=emf.createEntityManager();
        List<LaptopEntity> laptopEntities=new ArrayList<>();
        laptopEntities.add(new LaptopEntity(null, "Dell XPS 13", "Thin and lightweight laptop", 999.99, "Dell", "Intel Core i7"));
        laptopEntities.add(new LaptopEntity(null, "Apple MacBook Air", "Portable and powerful laptop", 1099.99, "Apple", "Apple M1"));
        laptopEntities.add(new LaptopEntity(null, "HP Envy x360", "Convertible laptop with great display", 699.99, "HP", "AMD Ryzen 7"));
        laptopEntities.add(new LaptopEntity(null, "Lenovo ThinkPad X1 Carbon", "Business laptop with great keyboard", 1299.99, "Lenovo", "Intel Core i7"));
        laptopEntities.add(new LaptopEntity(null, "Asus ZenBook 14", "Budget-friendly laptop with great performance", 499.99, "Asus", "Intel Core i5"));
        em.getTransaction().begin();
        for (LaptopEntity laptop:laptopEntities)
            em.persist(laptop);
        em.getTransaction().commit();

    }
}
