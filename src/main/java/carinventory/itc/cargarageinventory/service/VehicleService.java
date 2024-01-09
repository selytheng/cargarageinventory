package carinventory.itc.cargarageinventory.service;

import carinventory.itc.cargarageinventory.entity.Vehicle;

import java.util.List;

public interface VehicleService {
    List<Vehicle> getAllVehicles();

    Vehicle getVehicleById(int vid);

    void saveOrUpdateVehicle(Vehicle vehicle);

    void deleteVehicle(int vid);

    // Add the following method to the VehicleService interface

    List<Vehicle> searchVehicles(String search);

    void increaseStock(int vid, int quantity);
}
