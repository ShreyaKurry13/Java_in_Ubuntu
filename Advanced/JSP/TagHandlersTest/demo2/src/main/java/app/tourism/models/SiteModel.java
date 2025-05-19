package app.tourism.models;

import app.tourism.data.TravellerEntity;
import app.tourism.data.TripEntity;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;


public class SiteModel {

    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("app.data");

    public Iterable<Visitor> getVisitors() {
        try(var em = emf.createEntityManager()){
            var query = em.createQuery("SELECT e FROM TravellerEntity e WHERE e.rating > 0", TravellerEntity.class);
            return query.getResultStream()
                .map(Visitor::fromTraveller)
                .toList();
        }
    }

    public boolean acceptVisit(String visitorId, int visitorRating){
        if(visitorId == null || visitorRating < 1 || visitorRating > 5)
            return false;
        try(var em = emf.createEntityManager()){
            var traveller = em.find(TravellerEntity.class, visitorId);
            if(traveller == null){
                traveller = new TravellerEntity();
                traveller.setId(visitorId);
            }
            traveller.setRating(visitorRating);
            var trip = new TripEntity();
            trip.setGuest(traveller);
            traveller.getTours().add(trip);
            var tx = em.getTransaction();
            tx.begin();
            em.persist(traveller);
            tx.commit();
            return true;
        }
    }
}