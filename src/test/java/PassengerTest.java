import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PassengerTest {

    Passenger passenger;

    @BeforeEach
    public void setup(){
        passenger = new Passenger("Thor", "077842918234", "thor@asgard.com", 0001);
    }

    @Test
    public void canGetName() {
        assertThat(passenger.getName()).isEqualTo("Thor");
    }

    @Test
    public void canSetPassenger() {
        passenger.setName("Loki");
        assertThat(passenger.getName()).isEqualTo("Loki");
    }

    @Test
    public void canGetPhoneNumber() {
        assertThat(passenger.getPhoneNumber()).isEqualTo("077842918234");
    }

    @Test
    public void canSetPhoneNumber() {
        passenger.setPhoneNumber("077848475345");
        assertThat(passenger.getPhoneNumber()).isEqualTo("077848475345");
    }

    @Test
    public void canGetEmail() {
        assertThat(passenger.getEmail()).isEqualTo("thor@asgard.com");
    }

    @Test
    public void canSetEmail() {
        passenger.setEmail("loki@asgard.com");
        assertThat(passenger.getEmail()).isEqualTo("loki@asgard.com");
    }

    @Test
    public void canGetUniqueID() {
        assertThat(passenger.getUniqueID()).isEqualTo(0001);
    }

}
