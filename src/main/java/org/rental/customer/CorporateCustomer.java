package org.rental.customer;

import org.rental.vehicle.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class CorporateCustomer implements Customer {
    private String name;
    private String companyName;
    private List<Vehicle> rentedVehicles;
    private final double DISCOUNT_RATE = 0.10; // 10% discount

    public CorporateCustomer(String name, String companyName) {
        this.name = name;
        this.companyName = companyName;
        this.rentedVehicles = new ArrayList<>();
    }

    @Override
    public String getName() {
        return name + " (" + companyName + ")";
    }

    @Override
    public void rentVehicle(Vehicle vehicle, int days) {
        double originalCost = vehicle.calculateRentalCost(days);
        double discountedCost = originalCost * (1 - DISCOUNT_RATE);
        rentedVehicles.add(vehicle);
        System.out.println(getName() + " rented " + vehicle + " for " + days + " days. Discounted cost: " + discountedCost);
    }

    @Override
    public List<Vehicle> getRentedVehicles() {
        return rentedVehicles;
    }
}
