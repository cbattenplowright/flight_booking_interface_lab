import java.util.ArrayList;

public class Flight implements IBook{

    private String destination;
    private String flightID;
    private ArrayList<Passenger> passengers;

    public Flight(String destination, String flightID) {
        this.destination = destination;
        this.flightID = flightID;
        this.passengers = new ArrayList<>();
    }

    public String getDestination() {
        return this.destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getFlightID() {
        return this.flightID;
    }

    public int passengerCount() {
        return this.passengers.size();
    }

    public void addPassenger(Passenger passenger) {
        this.passengers.add(passenger);
    }


}
