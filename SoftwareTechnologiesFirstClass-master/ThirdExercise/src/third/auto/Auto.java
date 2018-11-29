package third.auto;

import java.util.ArrayList;
import java.util.Scanner;

public class Auto extends Vehicle {
    /**
     * 2.1
     */
//    public static String[] getEngineTypes() {
//        return engineTypes;
//    }
//
//    static String[] engineTypes= { "1.4", "1.6", "1.8", "2.0", "2.3"};
//
//    {
//        engineTypes[0]="1.4";
//        engineTypes[1]="1.6";
//        engineTypes[2]="1.8";
//        engineTypes[3]="2.0";
//        engineTypes[4]="2.3";
//    }

    public static ArrayList<String> engineTypes;
    public static int initializationCounter = 0;
    private String engineType;
    private String fuelType;
    private double averageFuelConsumption;

    {
        engineTypes.add("1.4");
        engineTypes.add("1.6");
        engineTypes.add("1.8");
        engineTypes.add("2.0");
        engineTypes.add("2.3");
    }

    public Auto(String manufacturer, String type, int dateOfCreation, String engineType) {
        super(manufacturer, type, dateOfCreation);

        this.engineType = engineType;
        this.fuelType = "benzin";
        this.averageFuelConsumption = calculateFuelConsumption(engineType);
        initializationCounter++;
    }

    public Auto(String manufacturer, String type, int dateOfCreation, String engineType, String fuelType, double averageFuelConsumption) {

        super(manufacturer, type, dateOfCreation);
        this.engineType = engineType;
        this.fuelType = fuelType;
        this.averageFuelConsumption = averageFuelConsumption;
        initializationCounter++;

    }

    /**
     * 2.2
     */
    public static ArrayList<String> getEngineTypes() {
        return engineTypes;
    }

    public static void addToEngineTypes(String enginetype) {
        engineTypes.add(enginetype);
    }

    public static int getInitializationCounter() {
        return initializationCounter;
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
        Scanner scanner = new Scanner(System.in);
        /**
         * 2.1
         */
//        boolean found=false;
//        do {  System.out.println("Please enter the capacity of the engine!");
//
//
//            for (String engine: Auto.getEngineTypes()
//                    ) {
//                if (engine.equals(engineType))
//                    found=true;
//            }
//
//                if (!found)
//                engineType =  scanner.next();
//
//
//        }while (!found);
        /**
         * 2.2
         */
        boolean found = false;
        for (String engine : Auto.getEngineTypes()
        ) {
            if (engine.equals(engineType))
                found = true;
        }
        if (!found)
            addToEngineTypes(engineType);


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

    public double calculateTravelPrice(double fuelPrice, double travelDistanceKM, double priceOfEuros) {
        return getAverageFuelConsumption() * travelDistanceKM * fuelPrice / 100 / (fuelPrice / priceOfEuros);
    }


    @Override
    public String toString() {
        return "Auto{" +
                "engineType='" + engineType + '\'' +
                ", fuelType='" + fuelType + '\'' +
                ", averageFuelConsumption=" + averageFuelConsumption +
                '}';
    }

    @Override
    public double getSpeed(double elapsedTime, double travelDistance) {
        return travelDistance / elapsedTime;
    }
}
