package Iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ParkingLot implements Iterable<Vehicle> {

    private List<Vehicle> vehicles = new ArrayList<Vehicle>();

    public ParkingLot(Vehicle... vehicles) {
        this.vehicles = Arrays.asList(vehicles);
    }

    @Override
    public Iterator<Vehicle> iterator() {
        return vehicles.iterator();
    }
}

