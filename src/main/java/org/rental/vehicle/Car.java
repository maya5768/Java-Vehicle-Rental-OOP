package org.rental.vehicle;

public class Car extends Vehicle {
        private String type; // e.g., Sedan, SUV, Hatchback

        public Car(String licensePlate, String make, String model, double rentalPrice, String type) {
            super(licensePlate, make, model, rentalPrice);
            this.type = type;
        }

        public String getType() {
            return type;
        }

        @Override
        public double calculateRentalCost(int days) {
            return rentalPrice * days; // fixed daily cost
        }

        @Override
        public String toString() {
            return "Car: " + super.toString() + " | Type: " + type + " | Daily Price: " + rentalPrice;
        }
    }
