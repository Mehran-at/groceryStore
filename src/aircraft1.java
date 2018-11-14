class aircraft1 {
    int passengers; //num of people
    int cruiseSpeed; //mph
    double fuelCapacity; //gallons
    double fuelBurnRate; // gallons per hour
    aircraft1(int p, int c, double fc, double fbr) {
        this.passengers = p;
        this.cruiseSpeed = c;
        this.fuelCapacity = fc;
        this.fuelBurnRate = fbr;
    }
    double calculateEndurance() {
        double endurance = this.fuelCapacity / this.fuelBurnRate;
        return endurance;
    }
    double fuelNeeded(double time) {
        return this.fuelBurnRate * time;
    }
}
