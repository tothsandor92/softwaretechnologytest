package first.auto;

public class Auto {

    private final int dateOfCreation;
    private String manufacturer;
    private String type;
    private String engineType;
    private String fuelType;
    private double averageFuelConsumption;

    public Auto(String manufacturer, String type, int dateOfCreation, String engineType) {
        this.manufacturer = manufacturer;
        this.type = type;
        this.dateOfCreation = dateOfCreation;
        this.engineType = engineType;
        this.fuelType = "benzin";
        this.averageFuelConsumption = calculateFuelConsumption(engineType);
    }

    public Auto(String manufacturer, String type, int dateOfCreation, String engineType, String fuelType, double averageFuelConsumption) {

        this.manufacturer = manufacturer;
        this.type = type;
        this.dateOfCreation = dateOfCreation;
        this.engineType = engineType;
        this.fuelType = fuelType;
        this.averageFuelConsumption = averageFuelConsumption;
    }

    public double calculateFuelConsumption(String motorType) {
        switch (motorType) {
            case "1.4":
                return 6.5;
            case "1.8":
                return 7.0;
            case "2.0":
                return 8.0;
            default:
                return 0;
        }
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

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public double getAverageFuelConsumption() {
        return averageFuelConsumption;
    }

    public void setAverageFuelConsumption(double averageFuelConsumption) {
        this.averageFuelConsumption = averageFuelConsumption;
    }


    public void changeMotor(String engineType, String fuelType, double fuelConsumption) {
        this.engineType = engineType;
        this.fuelType = fuelType;
        this.averageFuelConsumption = fuelConsumption;
    }

    public double calculateActualConsumption(double addedFuel, double travelDistanceKM) {
        return addedFuel / travelDistanceKM * 100;
    }

    public boolean isActualConsumptionLowerThanAverage(double addedFuel, double travelDistanceKM) {
        return calculateActualConsumption(addedFuel, travelDistanceKM) < getAverageFuelConsumption();
    }

    public double calculateTravelPrice(double fuelPrice, double travelDistanceKM) {
        return getAverageFuelConsumption() * travelDistanceKM * fuelPrice / 100;
    }


    @Override
    public String toString() {
        return "Auto{" +
                "manufacturer='" + manufacturer + '\'' +
                ", type='" + type + '\'' +
                ", dateOfCreation=" + dateOfCreation +
                ", engineType='" + engineType + '\'' +
                ", fuelType='" + fuelType + '\'' +
                ", averageFuelConsumption=" + averageFuelConsumption +
                '}';
    }


}
