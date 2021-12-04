package dynamictypes.publictransport;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PublicTransportTest {
    @Test
    void test() {
        PublicVehicle bus = new Bus(17, 15.5, "Skoda");
        PublicVehicle tram = new Tram(24, 9.6, 3);
        PublicVehicle metro = new Metro(66, 8.45, 8);

        PublicTransport publicTransport = new PublicTransport();
        publicTransport.addVehicle(bus);
        publicTransport.addVehicle(tram);
        publicTransport.addVehicle(metro);

        assertEquals(3, publicTransport.getVehicles().size());
    }
}