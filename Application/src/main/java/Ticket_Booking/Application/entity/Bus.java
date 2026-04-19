package Ticket_Booking.Application.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;

import java.util.HashMap;

@Entity

public class Bus {
    @Id
    @GeneratedValue
    long id;
//    @NotBlank
    String busname;
    String busnumber;
    String available;
    String Onboarding;
    String destinatoion;
    int seats;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBusname() {
        return busname;
    }

    public void setBusname(String busname) {
        this.busname = busname;
    }

    public String getBusnumber() {
        return busnumber;
    }

    public void setBusnumber(String busnumber) {
        this.busnumber = busnumber;
    }

    public String getAvailable() {
        return available;
    }

    public void setAvailable(String available) {
        this.available = available;
    }

    public String getOnboarding() {
        return Onboarding;
    }

    public void setOnboarding(String onboarding) {
        Onboarding = onboarding;
    }

    public String getDestinatoion() {
        return destinatoion;
    }

    public void setDestinatoion(String destinatoion) {
        this.destinatoion = destinatoion;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }
}
