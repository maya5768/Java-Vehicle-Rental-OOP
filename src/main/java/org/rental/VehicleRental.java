package org.rental;

import org.rental.vehicle.Car;
import org.rental.vehicle.Truck;
import org.rental.vehicle.Vehicle;
import org.rental.customer.CorporateCustomer;
import org.rental.customer.Customer;
import org.rental.customer.RegularCustomer;

import java.util.List;

public class VehicleRental {
    public static void main(String[] args) {
        // Create vehicles
        Vehicle car1 = new Car("123-45-678", "Toyota", "Corolla", 200.0, "Sedan");
        Vehicle truck1 = new Truck("555-11-222", "Volvo", "FH", 400.0, 5);

        // Create customers
        Customer regCustomer = new RegularCustomer("Alice");
        Customer corpCustomer = new CorporateCustomer("Bob", "TechCorp");

        // Rent vehicles
        regCustomer.rentVehicle(car1, 3);
        corpCustomer.rentVehicle(truck1, 2);

        // Display rented vehicles
        System.out.println("\n--- Rented Vehicles ---");
        displayRentedVehicles(regCustomer);
        displayRentedVehicles(corpCustomer);
    }

    private static void displayRentedVehicles(Customer customer) {
        System.out.println(customer.getName() + " has rented:");
        List<Vehicle> vehicles = customer.getRentedVehicles();
        for (Vehicle v : vehicles) {
            System.out.println(" - " + v);
        }
        System.out.println();
    }
}
