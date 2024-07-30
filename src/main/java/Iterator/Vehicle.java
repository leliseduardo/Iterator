package Iterator;

public class Vehicle {

    private String model;
    private boolean isParked;

    public Vehicle(String model, boolean isParked) {
        this.model = model;
        this.isParked = isParked;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public boolean isParked() {
        return isParked;
    }

    public void setParked(boolean parked) {
        isParked = parked;
    }
}

