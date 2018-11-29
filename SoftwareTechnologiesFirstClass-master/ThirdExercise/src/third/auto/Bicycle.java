package third.auto;

public class Bicycle extends Vehicle {

    String gearboxType;
    int gearboxGears;

    public Bicycle(String manufacturer, String type, int dateOfCreation, String gearboxType, int gearboxGears) {

        super(manufacturer, type, dateOfCreation);
        this.gearboxType = gearboxType;
        this.gearboxGears = gearboxGears;
    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "gearboxType='" + gearboxType + '\'' +
                ", gearboxGears=" + gearboxGears +
                "} " + super.toString();
    }

    public int getGearboxGears() {
        return gearboxGears;
    }

    public void setGearboxGears(int gearboxGears) {
        this.gearboxGears = gearboxGears;
    }

    public String getGearboxType() {
        return gearboxType;
    }

    public void setGearboxType(String gearboxType) {
        this.gearboxType = gearboxType;
    }

    @Override
    public double getSpeed(double elapsedTime, double travelDistance) {
        return travelDistance / elapsedTime;
    }
}
