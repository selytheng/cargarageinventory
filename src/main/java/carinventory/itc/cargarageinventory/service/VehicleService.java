package carinventory.itc.cargarageinventory.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import carinventory.itc.cargarageinventory.repository.VehicleRepository;
import carinventory.itc.cargarageinventory.entity.Vehicle;

import java.util.List;

@Service
public class VehicleService {

    @Autowired
    private VehicleRepository vehicleRepository;

    public List<Vehicle> getAllVehicles() {
        return (List<Vehicle>) vehicleRepository.findAll();
    }

    public Vehicle getVehicleById(int vid) {
        return vehicleRepository.findById(vid).orElse(null);
    }

    public void addVehicle(Vehicle vehicle) {
        vehicleRepository.save(vehicle);
    }

    public void updateVehicle(int vid, Vehicle updatedVehicle) {
        Vehicle existingVehicle = vehicleRepository.findById(vid).orElse(null);
        if (existingVehicle != null) {
            // Update fields based on your requirements
            existingVehicle.setVid(updatedVehicle.getVid());
            existingVehicle.setModel_year(updatedVehicle.getModel_year());
            existingVehicle.setManufacturer(updatedVehicle.getManufacturer());
            existingVehicle.setModel(updatedVehicle.getModel());
            existingVehicle.setColor(updatedVehicle.getColor());
            existingVehicle.setMileage(updatedVehicle.getMileage());
            existingVehicle.setRegistation_number(updatedVehicle.getRegistation_number());
            existingVehicle.setPrice(updatedVehicle.getPrice());
            // Update other fields...

            vehicleRepository.save(existingVehicle);
        }
    }

    public void deleteVehicle(int vid) {
        vehicleRepository.deleteById(vid);
    }
}
