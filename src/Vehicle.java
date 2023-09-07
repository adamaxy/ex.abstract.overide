
abstract class Vehicle {
    String type;
    int numberOfWheels;

    public Vehicle(String type, int numberOfWheels) {
        this.type = type;
        this.numberOfWheels = numberOfWheels;
    }
    abstract void doVehicleSound();
    void showVehicleDetails() {
        System.out.println("Type: " + type);
        System.out.println("Number of Wheels: " + numberOfWheels);
}
    }