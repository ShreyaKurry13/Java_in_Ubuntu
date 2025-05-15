package app.tourism.data;

import java.util.Date;

public class TripEntity {
    
    private int id;

    private Date checkin = new Date();

    private TravellerEntity guest;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getCheckin() {
        return checkin;
    }

    public void setCheckin(Date checkin) {
        this.checkin = checkin;
    }

    public TravellerEntity getGuest() {
        return guest;
    }

    public void setGuest(TravellerEntity guest) {
        this.guest = guest;
    }

    
}