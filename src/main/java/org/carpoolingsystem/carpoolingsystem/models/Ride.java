package org.carpoolingsystem.carpoolingsystem.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "rides")
public class Ride {
    @Id
    private String id;
    private String startDestination;
    private String endDestination;
    private String dateOfStart;
    private String timeOfStart;
    private int fare;
    private int seatsAvailable;

    // Constructors
    public Ride() {}

    public Ride(String startDestination, String endDestination, String dateOfStart, String timeOfStart, int fare, int seatsAvailable) {
        this.startDestination = startDestination;
        this.endDestination = endDestination;
        this.dateOfStart = dateOfStart;
        this.timeOfStart = timeOfStart;
        this.fare = fare;
        this.seatsAvailable = seatsAvailable;
    }

    // Getters and Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getStartDestination() { return startDestination; }
    public void setStartDestination(String startDestination) { this.startDestination = startDestination; }

    public String getEndDestination() { return endDestination; }
    public void setEndDestination(String endDestination) { this.endDestination = endDestination; }

    public String getDateOfStart() { return dateOfStart; }
    public void setDateOfStart(String dateOfStart) { this.dateOfStart = dateOfStart; }

    public String getTimeOfStart() { return timeOfStart; }
    public void setTimeOfStart(String timeOfStart) { this.timeOfStart = timeOfStart; }

    public int getFare() { return fare; }
    public void setFare(int fare) { this.fare = fare; }

    public int getSeatsAvailable() { return seatsAvailable; }
    public void setSeatsAvailable(int seatsAvailable) { this.seatsAvailable = seatsAvailable; }
}
