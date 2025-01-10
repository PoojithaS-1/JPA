package com.xworkz.electronicgadgetsapp.runner;

import com.xworkz.electronicgadgetsapp.entity.GamingAccessoryEntity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class GamingAccessoryRunner {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("poojitha");
        EntityManager em = emf.createEntityManager();

        List<GamingAccessoryEntity> gamingAccessoryEntities = new ArrayList<>();

        gamingAccessoryEntities.add(new GamingAccessoryEntity(null, "Logitech G502 Gaming Mouse", "High-precision gaming mouse", 69.99, "Logitech", "PC, Mac"));
        gamingAccessoryEntities.add(new GamingAccessoryEntity(null, "Razer BlackWidow Chroma V2 Gaming Keyboard", "Mechanical gaming keyboard with customizable backlighting", 169.99, "Razer", "PC"));
        gamingAccessoryEntities.add(new GamingAccessoryEntity(null, "SteelSeries Arctis 7 Gaming Headset", "Wireless gaming headset with long battery life", 149.99, "SteelSeries", "PC, PS4, Xbox One"));
        gamingAccessoryEntities.add(new GamingAccessoryEntity(null, "Corsair MM300 Gaming Mousepad", "High-performance gaming mousepad with durable construction", 29.99, "Corsair", "PC"));
        gamingAccessoryEntities.add(new GamingAccessoryEntity(null, "HyperX Cloud II Gaming Headset", "Wireless gaming headset with great sound quality", 99.99, "HyperX", "PC, PS4, Xbox One"));

        em.getTransaction().begin();
        for (GamingAccessoryEntity gamingAccessory : gamingAccessoryEntities) {
            em.persist(gamingAccessory);
        }
        em.getTransaction().commit();
    }
}