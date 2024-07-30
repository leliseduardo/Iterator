package Iterator;

import java.util.Iterator;

public class Record {

    public static Integer countParkedVehicles(ParkingLot parkingLot) {
        int count = 0;
        for (Vehicle vehicle : parkingLot) {
            if (vehicle.isParked()) {
                count++;
            }
        }
        return count;
    }

    public static Integer countTotalRegisteredVehicles(ParkingLot parkingLot) {
        int count = 0;
        for (Iterator v = parkingLot.iterator(); v.hasNext(); ) {
            count++;
            v.next();
        }
        return count;
    }
}
