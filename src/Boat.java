class Boat extends Vehicle {
    private double maxKnotsSpeed;
    private int boatKilosWeight;

    public Boat(double maxKnotsSpeed, int boatKilosWeight) {
        super("Boat", 0); // Boats typically have 0 wheels
        this.maxKnotsSpeed = maxKnotsSpeed;
        this.boatKilosWeight = boatKilosWeight;
    }

    @Override
    void doVehicleSound() {
        System.out.println("Boat Sound: Splash Splash");
    }

    String getBoatWeightAndSpeed() {
        return "Boat Weight: " + boatKilosWeight + " kilograms, Maximum Knots Speed: " + maxKnotsSpeed;
    }
}
