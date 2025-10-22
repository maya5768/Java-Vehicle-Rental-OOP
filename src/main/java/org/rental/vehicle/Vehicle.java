package org.rental.vehicle;


    /**
     * Abstract class representing a general vehicle.
     */
    public abstract class Vehicle {
        private String licensePlate;
        private String make;
        private String model;
        protected double rentalPrice;

        public Vehicle(String licensePlate, String make, String model, double rentalPrice) {
            this.licensePlate = licensePlate;
            this.make = make;
            this.model = model;
            this.rentalPrice = rentalPrice;
        }

        public String getLicensePlate() {
            return licensePlate;
        }

        public String getMake() {
            return make;
        }

        public String getModel() {
            return model;
        }

        public double getRentalPrice() {
            return rentalPrice;
        }

        /**
         * Abstract method to calculate rental cost.
         * @param days number of days
         * @return rental cost
         */
        public abstract double calculateRentalCost(int days);

        @Override
        public String toString() {
            return make + " " + model + " (" + licensePlate + ")";
        }
    }


