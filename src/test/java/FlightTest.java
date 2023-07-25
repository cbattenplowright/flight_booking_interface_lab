import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class FlightTest {

    Flight flight;

    @BeforeEach
    public void setUp() {
        flight = new Flight("Italy", "BA1001");
    }

    @Test
    public void canGetDestination() {
        assertThat(flight.getDestination()).isEqualTo("Italy");
    }

    @Test
    public void canSetDestination() {
        flight.setDestination("Greece");
        assertThat(flight.getDestination()).isEqualTo("Greece");
    }

    @Test
    public void canGetFlightID() {
        assertThat(flight.getFlightID()).isEqualTo("BA1001");
    }

    @Test
    public void canGetPassengerCount() {
        assertThat(flight.passengerCount()).isEqualTo(0);
    }

    @Test
    public void canAddPassenger() {
        Passenger passenger = new Passenger("Thor", "077842918234", "thor@asgard.com", 0001);
        flight.addPassenger(passenger);
        assertThat(flight.passengerCount()).isEqualTo(1);
    }

}
