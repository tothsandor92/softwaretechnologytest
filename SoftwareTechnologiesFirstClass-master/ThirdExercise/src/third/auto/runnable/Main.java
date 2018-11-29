package third.auto.runnable;


import third.auto.Auto;

import java.util.Scanner;

import static third.auto.Auto.addToEngineTypes;


public class Main {

    public static void main(String[] args) {


        for (String engines : Auto.getEngineTypes()
        ) {
            System.out.println(engines);
        }
        Auto[] autos = new Auto[2];
        Scanner scanner = new Scanner(System.in);
        int actualYear = java.time.LocalDate.now().getYear();
        String manufacturer;
        String model;
        int dateOfCreation;
        String engineType;

        System.out.println("Please enter the data (4 paramaters) of the first car:");
        System.out.println("Please enter the name of the manufacturer!");
        manufacturer = scanner.next();
        System.out.println("Please enter the name of the model!");
        model = scanner.next();
        do {
            System.out.println("Please enter the year the car was manufactured on!");
            dateOfCreation = scanner.nextInt();
        } while (dateOfCreation > actualYear || dateOfCreation < actualYear - 20);

/**
 * 2.2
 */
        engineType = scanner.next();
        boolean found = false;
        for (String engine : Auto.getEngineTypes()
        ) {
            if (engine.equals(engineType))
                found = true;
        }
        if (!found)
            addToEngineTypes(engineType);

        /**
         * 2.1
         */
//        boolean found=false;
//        do {  System.out.println("Please enter the capacity of the engine!");
//            engineType =  scanner.next();
//
//            for (String engine: Auto.getEngineTypes()
//                 ) {
//                if (engine.equals(engineType))
//                    found=true;
//            }
//
//        }while (!found);


        autos[0] = new Auto(manufacturer, model, dateOfCreation, engineType);
        System.out.println(autos[0]);

        System.out.println("Please  enter the data (6 parameters) of the second car");
        System.out.println("Please enter the name of the manufacturer!");
        manufacturer = scanner.next();
        System.out.println("Please enter the name of the model!");
        model = scanner.next();
        do {
            System.out.println("Please enter the year the car was manufactured on!");
            dateOfCreation = scanner.nextInt();
        } while (dateOfCreation > actualYear || dateOfCreation < actualYear - 20);
        found = false;

        /**
         * 2.2
         */
        found = false;
        for (String engine : Auto.getEngineTypes()
        ) {
            if (engine.equals(engineType))
                found = true;
        }
        if (!found)
            addToEngineTypes(engineType);
/**
 * 2.1
 */
//        do {  System.out.println("Please enter the capacity of the engine!");
//            engineType =  scanner.next();
//
//            for (String engine: Auto.getEngineTypes()
//                    ) {
//                if (engine.equals(engineType))
//                    found=true;
//            }
//
//        }while (!found);
        System.out.println("Please enter the type of fuel accepted by the car");
        String fuelType = scanner.next();
        System.out.println("Please enter the average amount of fuel consumed by the car");
        double averageFuelConsumption = scanner.nextDouble();


        autos[1] = new Auto(manufacturer, model, dateOfCreation, engineType, fuelType, averageFuelConsumption);


        autos[1].changeMotor("4.0", "diesel", 8.0);
        System.out.println(autos[1]);

        double[] consuptionArray = new double[5];
        for (int i = 0; i < 5; i++) {
            consuptionArray[i] = autos[1].calculateActualConsumption(i + 2, i * 2 + 10);
        }
        double calculatedAverageConsuption = 0;
        for (double consuption : consuptionArray
        ) {
            calculatedAverageConsuption += consuption;
        }
        calculatedAverageConsuption /= consuptionArray.length;
        System.out.println("Actual consuption: " + autos[1].getAverageFuelConsumption() + "Expected consuption:" + autos[1].calculateFuelConsumption(autos[1].getEngineType()));

        double[] travelCostArray = new double[5];
        double calculatedTravelCost = 0;
        for (int i = 0; i < 5; i++) {
            travelCostArray[i] = autos[0].calculateTravelPrice(400, i * 2 + 20);
            calculatedTravelCost += travelCostArray[i];
        }
        System.out.println("Calculated cost of travel:" + calculatedTravelCost);

    }


}
