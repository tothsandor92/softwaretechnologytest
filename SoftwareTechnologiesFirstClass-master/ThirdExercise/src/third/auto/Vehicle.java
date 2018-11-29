package third.auto;

public abstract class Vehicle {

    private final int dateOfCreation;
    private String manufacturer;
    private String type;

    public Vehicle(String manufacturer, String type, int dateOfCreation) {
        this.manufacturer = manufacturer;
        this.type = type;
        this.dateOfCreation = dateOfCreation;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "manufacturer='" + manufacturer + '\'' +
                ", type='" + type + '\'' +
                ", dateOfCreation=" + dateOfCreation +
                '}';
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getDateOfCreation() {
        return dateOfCreation;
    }

    public abstract double getSpeed(double elapsedTime, double travelDistance);
}
