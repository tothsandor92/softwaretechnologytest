public enum Planet {

    MERCURY(0.24,4878,57.9),
    VENUS(0.62,12104,108.2),
    EARTH(1,12756,149.6),
    MARS(1.88,6794,227.9),
    JUPITER(11.86,142800,779),
    SATURN(29.46,120000,1432),
    URANUS(84.01,50800,2884),
    NEPTUNE(164.79,48600,4509);

    public double getGravitationalWeightConstant() {
        return gravitationalWeightConstant;
    }

    public double getRadius() {
        return radius;
    }

    public double getDistanceFromSun() {
        return distanceFromSun;
    }

    double gravitationalWeightConstant;
        double radius;
        double distanceFromSun;

    Planet(double gravitationalWeightConstant, double radius, double distanceFromSun) {
        this.gravitationalWeightConstant = gravitationalWeightConstant;
        this.radius = radius;
        this.distanceFromSun = distanceFromSun;
    }
}
