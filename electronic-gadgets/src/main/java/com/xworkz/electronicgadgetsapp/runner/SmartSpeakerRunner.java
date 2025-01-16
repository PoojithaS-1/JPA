package com.xworkz.electronicgadgetsapp.runner;

import com.xworkz.electronicgadgetsapp.entity.SmartSpeakerEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class SmartSpeakerRunner {
    public static void main(String[] args) {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("poojitha");
        EntityManager em= emf.createEntityManager();
        List<SmartSpeakerEntity> smartSpeakerEntities=new ArrayList<>();
        smartSpeakerEntities.add(new SmartSpeakerEntity(null,"Amazon Echo","Smart speaker with Alexa virtual assistant",99.99 ,"Amazon","Alexa"));
        smartSpeakerEntities.add(new SmartSpeakerEntity(null,"Google Home","Smart speaker with Google Assistant virtual assistant",129.99 ,"Google","Google Assistant"));
        smartSpeakerEntities.add(new SmartSpeakerEntity(null,"Apple HomePod","Smart speaker with Siri virtual assistant",299.99 ,"Apple","Siri"));
        smartSpeakerEntities.add(new SmartSpeakerEntity(null,"Sonos One","Smart speaker with Alexa and Google Assistant virtual assistants",199.99 ,"Sonos","Alexa, Google Assistant"));
        smartSpeakerEntities.add(new SmartSpeakerEntity(null,"Harman Kardon Invoke","Smart speaker with Cortana virtual assistant",149.99 ,"Harman Kardon","Cortana"));

        em.getTransaction().begin();
        for (SmartSpeakerEntity smartSpeaker:smartSpeakerEntities){
            em.persist(smartSpeaker);
        }
        em.getTransaction().commit();
    }
}
