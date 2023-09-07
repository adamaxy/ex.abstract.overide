class Car extends Vehicle {
    private int numberOfDoors;
    private double carPrice;

    public Car(int numberOfWheels, int numberOfDoors, double carPrice) {
        super("Car", numberOfWheels);
        this.numberOfDoors = numberOfDoors;
        this.carPrice = carPrice;
    }
        @Override
        void doVehicleSound() {
            System.out.println("Car Sound: Vroom Vroom");
        }

        @Override
        void showVehicleDetails() {
            super.showVehicleDetails();
            System.out.println("Number of Doors: " + numberOfDoors);
        }
    }
