import java.util.Objects;
import java.util.Scanner;

public class Booker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Airport airport = new Airport();
        boolean isRunning = true;
        Flight italy = new Flight("Italy", "B1001");
        Flight greece = new Flight("Greece", "B1002");
        Flight spain = new Flight("Spain", "B1003");
        airport.addFlight(italy);
        airport.addFlight(greece);
        airport.addFlight(spain);


        System.out.println("Welcome To The Flight Booker");

        while (isRunning) {
            airport.displayFlights();

//          takes in user destination
            System.out.println("Type in destination:");
            String destination = scanner.nextLine();

//          takes in passenger details
            System.out.println("Please enter your name:");
            String passengerName = scanner.nextLine();
            System.out.println("Please enter your phone number:");
            String phoneNumber = scanner.nextLine();
            System.out.println("Please enter your email:");
            String email = scanner.nextLine();
            System.out.println("Please enter your ID number:");
            int passengerID = Integer.parseInt(scanner.nextLine());

            Passenger passenger = new Passenger(passengerName, phoneNumber, email, passengerID);

//         add passenger to flight with given destination
            for (Flight flight : airport.flights) {
                if (flight.getDestination().equals(destination)) {
                    flight.addPassenger(passenger);
                }
            }
            System.out.println("You are going to " + destination + "!");

//          Allows user to book another flight
            System.out.println("Do you want to book another flight? y/n:");
            String bookAgain = scanner.nextLine();

            if (bookAgain.equals("n")) {
                isRunning = false;
                System.out.println("Goodbye, enjoy your holiday!");
            }
        }
        //          Adding a new flight
        System.out.println("Enter new flight destination:");
        String newDestination = scanner.nextLine();

        System.out.println("Enter flight ID of new destination:");
        String newFlightID = scanner.nextLine();

        airport.addFlight(new Flight(newDestination,newFlightID));

//              Cancelling flights
        System.out.println("Enter cancelled flight ID:");
        String cancelledFlightID = scanner.nextLine();

        airport.cancelFlight(cancelledFlightID);
    }
}
