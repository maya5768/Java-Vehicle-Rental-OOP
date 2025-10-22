package org.rental.customer;

import org.rental.vehicle.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class RegularCustomer implements Customer {
    private String name;
    private List<Vehicle> rentedVehicles;

    public RegularCustomer(String name) {
        this.name = name;
        this.rentedVehicles = new ArrayList<>();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void rentVehicle(Vehicle vehicle, int days) {
        rentedVehicles.add(vehicle);
        System.out.println(name + " rented " + vehicle + " for " + days + " days. Total cost: " + vehicle.calculateRentalCost(days));
    }

    @Override
    public List<Vehicle> getRentedVehicles() {
        return rentedVehicles;
    }
}
