public class Main {
    public static void main(String[] args) {
        Car myCar = new Car(4, 4, 25000.0);
        Boat myBoat = new Boat(30.5, 5000);

        // Invoke the methods for Car and Boat objects
        System.out.println("Car Details:");
        myCar.showVehicleDetails();
        myCar.doVehicleSound();

        System.out.println("\nBoat Details:");
        myBoat.showVehicleDetails();
        myBoat.doVehicleSound();

        // Print Boat weight and speed
        System.out.println("\n" + myBoat.getBoatWeightAndSpeed());
    }
}