import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AirportTest {

    Airport airport;

    @BeforeEach
    public void setup() {
        airport = new Airport();
    }

    @Test
    public void canAddFlight() {
        Flight flight = new Flight("Italy", "BA1001");
        airport.addFlight(flight);
        assertThat(airport.flights.size()).isEqualTo(1);
    }

    @Test
    public void canCancelFlight() {
        Flight flight = new Flight("Italy", "BA1001");
        airport.addFlight(flight);
        airport.cancelFlight("BA1001");
        assertThat(airport.flights.size()).isEqualTo(0);
    }

    @Test
    public void canDisplayFlights() {
        Flight flight = new Flight("Italy", "BA1001");
        airport.addFlight(flight);
        airport.displayFlights();
    }
}
