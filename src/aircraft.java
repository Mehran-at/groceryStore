//
class aircraft {
    int passengers; //num of people
    int cruiseSpeed; //mph
    double fuelCapacity; //gallons
    double fuelBurnRate; // gallons per hour
    void calculateEndurance() {
        double endurance;
        endurance = fuelCapacity / fuelBurnRate;
        System.out.print("\nThe endurance is " + endurance + " hours.");
    }
}
