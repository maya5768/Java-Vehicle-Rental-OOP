package org.rental.vehicle;

public class Truck extends Vehicle {
    private int capacity; // in tons

    public Truck(String licensePlate, String make, String model, double rentalPrice, int capacity) {
        super(licensePlate, make, model, rentalPrice);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public double calculateRentalCost(int days) {
        // Example: base price + 50 per ton per day
        return (rentalPrice * days) + (capacity * 50 * days);
    }

    @Override
    public String toString() {
        return "Truck: " + super.toString() + " | Capacity: " + capacity + " tons | Daily Price: " + rentalPrice;
    }
}
