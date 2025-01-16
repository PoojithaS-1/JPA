package com.xworkz.electronicgadgetsapp.runner;

import com.xworkz.electronicgadgetsapp.entity.GamingConsoleEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class GamingConsoleRunner {
    public static void main(String[] args) {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("poojitha");
        EntityManager em=emf.createEntityManager();
        List<GamingConsoleEntity> gamingConsoleEntities=new ArrayList<>();
        gamingConsoleEntities.add(new GamingConsoleEntity(null,"PlayStation 5", "Next-gen gaming console with great performance", 499.99,"Sony", "AMD Ryzen 7"));
        gamingConsoleEntities.add(new GamingConsoleEntity(null,"Xbox Series X", "Next-gen gaming console with great design", 499.99,"Microsoft", "AMD Ryzen 7"));
        gamingConsoleEntities.add(new GamingConsoleEntity(null,"Nintendo Switch", "Portable gaming console with great games", 299.99,"Nintendo", "NVIDIA Tegra X1"));
        gamingConsoleEntities.add(new GamingConsoleEntity(null,"PlayStation 4 Pro", "High-end gaming console with great performance", 399.99,"Sony", "AMD Jaguar"));
        gamingConsoleEntities.add(new GamingConsoleEntity(null,"Xbox One X", "High-end gaming console with great design", 499.99,"Microsoft", "AMD Scorpio"));

        em.getTransaction().begin();
        for (GamingConsoleEntity console:gamingConsoleEntities){
            em.persist(console);
        }
        em.getTransaction().commit();
    }
}
