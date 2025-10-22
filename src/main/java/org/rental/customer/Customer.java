package org.rental.customer;

import org.rental.vehicle.Vehicle;

import java.util.List;

public interface Customer {
    String getName();
    void rentVehicle(Vehicle vehicle, int days);
    List<Vehicle> getRentedVehicles();
}
