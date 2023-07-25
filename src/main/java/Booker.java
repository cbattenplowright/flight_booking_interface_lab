import java.util.Scanner;

public class Booker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Airport airport = new Airport();
        Flight italy = new Flight("Italy", "B1001");
        Flight greece = new Flight("Greece", "B1002");
        Flight spain = new Flight("Spain", "B1003");
        airport.addFlight(italy);
        airport.addFlight(greece);
        airport.addFlight(spain);


        System.out.println("Welcome To The Flight Booker");
        airport.displayFlights();

// takes in user destination
        System.out.println("Type in destination:");
        String destination = scanner.nextLine();

// takes in passenger details
        System.out.println("Please enter your name:");
        String passengerName = scanner.nextLine();
        System.out.println("Please enter your phone number:");
        String phoneNumber = scanner.nextLine();
        System.out.println("Please enter your email:");
        String email = scanner.nextLine();
        System.out.println("Please enter your ID number:");
        

    }
}
