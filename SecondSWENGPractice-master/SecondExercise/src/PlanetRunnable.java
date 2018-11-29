import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class PlanetRunnable {


    public static void main(String[] args){

        int weight=5;

        Map<String, Double> planetsMap= new HashMap<>();
        planetsMap.values().add(0.78);
        planetsMap.keySet().add("Mercury");



        double calculatedWeight=Planet.MERCURY.getGravitationalWeightConstant()*weight;



    }

}
