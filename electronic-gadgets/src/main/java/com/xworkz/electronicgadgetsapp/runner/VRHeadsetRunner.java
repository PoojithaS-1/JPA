package com.xworkz.electronicgadgetsapp.runner;

import com.xworkz.electronicgadgetsapp.entity.VRHeadsetEntity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class VRHeadsetRunner {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("poojitha");
        EntityManager em = emf.createEntityManager();

        List<VRHeadsetEntity> vrHeadsetEntities = new ArrayList<>();

        vrHeadsetEntities.add(new VRHeadsetEntity(null, "Oculus Quest 2", "Wireless VR headset with great graphics", 299.99, "Oculus", "1832 x 1920 per eye", "72Hz"));
        vrHeadsetEntities.add(new VRHeadsetEntity(null, "HTC Vive Pro 2", "High-end PC-based VR headset with advanced tracking", 1399.99, "HTC", "1832 x 1920 per eye", "120Hz"));
        vrHeadsetEntities.add(new VRHeadsetEntity(null, "PlayStation VR", "Console-based VR headset with great games", 299.99, "Sony", "1024 x 1024 per eye", "120Hz"));
        vrHeadsetEntities.add(new VRHeadsetEntity(null, "Valve Index", "High-end PC-based VR headset with advanced tracking", 999.99, "Valve", "1832 x 1920 per eye", "120Hz"));
        vrHeadsetEntities.add(new VRHeadsetEntity(null, "HP Reverb G2", "High-end PC-based VR headset with advanced tracking", 599.99, "HP", "2160 x 2160 per eye", "90Hz"));

        em.getTransaction().begin();
        for (VRHeadsetEntity vrHeadset : vrHeadsetEntities) {
            em.persist(vrHeadset);
        }
        em.getTransaction().commit();
    }
}