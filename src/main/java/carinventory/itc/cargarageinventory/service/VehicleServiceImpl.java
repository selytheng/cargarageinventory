package carinventory.itc.cargarageinventory.service;

import carinventory.itc.cargarageinventory.entity.Vehicle;
import carinventory.itc.cargarageinventory.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleServiceImpl implements VehicleService {

    @Autowired
    private VehicleRepository vehicleRepository;

    @Override
    public List<Vehicle> getAllVehicles() {
        return vehicleRepository.findAll();
    }

    @Override
    public Vehicle getVehicleById(int vid) {
        return vehicleRepository.findById(vid).orElse(null);
    }

    @Override
    public void saveOrUpdateVehicle(Vehicle vehicle) {
        vehicleRepository.save(vehicle);
    }

    @Override
    public void deleteVehicle(int vid) {
        vehicleRepository.deleteById(vid);
    }
}
