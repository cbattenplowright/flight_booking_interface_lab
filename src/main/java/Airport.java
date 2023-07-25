import java.util.ArrayList;

public class Airport {

    protected ArrayList<Flight> flights;

    public Airport() {
        this.flights = new ArrayList<>();
    }

    public void addFlight(Flight flight) {
        this.flights.add(flight);
    }

    public void cancelFlight(String flightID) {
        // find in the array list the flight that matches the flightID
        // get that index
        // remove that flight
//        removes flight if the flight ID matches
        this.flights.removeIf(flight -> flight.getFlightID().equals(flightID));
    }

    public void displayFlights() {
        System.out.println("The current flights are: ");
        for (Flight flight : this.flights) {
            System.out.println("Destination: " + flight.getDestination() + " Flight ID: " + flight.getFlightID());
        }
    }
}
