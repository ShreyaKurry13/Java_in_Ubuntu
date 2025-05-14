package app.tourism.models;

import app.tourism.models.Visitor;

public class SiteModel {
    
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("app.data");

    public Iterable<Visitor> getVisitors() {
        
    }
}
