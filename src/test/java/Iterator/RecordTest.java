package Iterator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RecordTest {

    @Test
    void shouldCountParkedVehicles() {
        ParkingLot parkingLot = new ParkingLot(
                new Vehicle("911 Turbo", true),
                new Vehicle("Carrera GT", true),
                new Vehicle("Beetle", false),
                new Vehicle("Corvette Z06", true)
        );
        assertEquals(3, Record.countParkedVehicles(parkingLot));
    }

    @Test
    void shouldCountTotalRegisteredVehicles() {
        ParkingLot parkingLot = new ParkingLot(
                new Vehicle("911 Turbo", true),
                new Vehicle("Carrera GT", true),
                new Vehicle("Beetle", false),
                new Vehicle("Corvette Z06", true)
        );
        assertEquals(4, Record.countTotalRegisteredVehicles(parkingLot));
    }
}
