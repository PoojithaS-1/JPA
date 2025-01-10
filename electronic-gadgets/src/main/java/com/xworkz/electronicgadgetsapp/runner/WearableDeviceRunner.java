package com.xworkz.electronicgadgetsapp.runner;

import com.xworkz.electronicgadgetsapp.entity.WearableDeviceEntity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class WearableDeviceRunner {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("poojitha");
        EntityManager em = emf.createEntityManager();

        List<WearableDeviceEntity> wearableDeviceEntities = new ArrayList<>();

        wearableDeviceEntities.add(new WearableDeviceEntity(null, "Apple Watch Series 7", "Smartwatch with fitness tracking and notification alerts", 399.99, "Apple", "watchOS", "iOS"));
        wearableDeviceEntities.add(new WearableDeviceEntity(null, "Samsung Galaxy Watch4", "Smartwatch with fitness tracking and notification alerts", 299.99, "Samsung", "Wear OS", "Android"));
        wearableDeviceEntities.add(new WearableDeviceEntity(null, "Fitbit Versa 3", "Fitness smartwatch with heart rate monitoring and GPS tracking", 229.99, "Fitbit", "Fitbit OS", "Android, iOS"));
        wearableDeviceEntities.add(new WearableDeviceEntity(null, "Garmin Forerunner 945", "GPS smartwatch with advanced running dynamics and music storage", 599.99, "Garmin", "Garmin OS", "Android, iOS"));
        wearableDeviceEntities.add(new WearableDeviceEntity(null, "Huawei Watch GT 2", "Smartwatch with fitness tracking and notification alerts", 299.99, "Huawei", "Harmony OS", "Android"));

        em.getTransaction().begin();
        for (WearableDeviceEntity wearableDevice : wearableDeviceEntities) {
            em.persist(wearableDevice);
        }
        em.getTransaction().commit();
    }
}