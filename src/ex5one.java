//
//
public class ex5one {
    public static void main(String[] args) {
        aircraft cessna172 = new  aircraft();
        aircraft piperSaratoga = new aircraft();
        //double cessna172Endurance;
        cessna172.passengers = 4;
        cessna172.cruiseSpeed = 140;
        cessna172.fuelCapacity = 56.5;
        cessna172.fuelBurnRate = 9.5;
        //cessna172Endurance = cessna172.fuelBurnRate / cessna172.fuelBurnRate;
        System.out.print(" \nCessna 172 can take " + cessna172.passengers + " passengers with max speed of "
                + cessna172.cruiseSpeed + " mph and it's fuel burn rate is " + cessna172.fuelBurnRate +
                " gph and it can hold " + cessna172.fuelCapacity + " gallons of gas.");
        cessna172.calculateEndurance();
        //System.out.print("\nA Cessna 172 can stay aloft for " + cessna172Endurance + " hours.");
        piperSaratoga.passengers = 6;
        piperSaratoga.cruiseSpeed = 201;
        piperSaratoga.fuelCapacity = 102.5;
        piperSaratoga.fuelBurnRate = 20.5;
        System.out.print(" \nPiper Saratoga aircraft can take " + piperSaratoga.passengers + " passengers with max speed of "
                + piperSaratoga.cruiseSpeed + " mph and it's fuel burn rate is " + piperSaratoga.fuelBurnRate +
                " gph and it can hold " + piperSaratoga.fuelCapacity + " gallons of gas.");
        piperSaratoga.calculateEndurance();
    }
}
