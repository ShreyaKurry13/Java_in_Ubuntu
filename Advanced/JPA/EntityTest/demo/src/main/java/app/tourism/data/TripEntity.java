package app.tourism.data;

import java.util.Date;

import app.tourism.data.TravallerEntity;

public class TripEntity {

    private int id;

    private Date checkin = new Date();

    private TravallerEntity guest;

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

    public TravelerEntity getGuest() {
        return guest;
    }

    public void setGuest(TravelerEntity guest) {
        this.guest = guest;
    }

}