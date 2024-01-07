// package carinventory.itc.cargarageinventory.service;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Service;

// import carinventory.itc.cargarageinventory.repository.VehicleRepository;
// import carinventory.itc.cargarageinventory.entity.Vehicle;

// import java.util.List;

// @Service
// public class VehicleServiceImpl implements VehicleService {

//     @Autowired
//     private VehicleRepository vehicleRepository;

//     @Override
//     public List<Vehicle> getAllVehicles() {
//         return vehicleRepository.findAll();
//     }

//     @Override
//     public Vehicle getVehicleById(Long id) {
//         return vehicleRepository.findById(id).orElse(null);
//     }

//     @Override
//     public void addVehicle(Vehicle vehicle) {
//         vehicleRepository.save(vehicle);
//     }

//     @Override
//     public void updateVehicle(Long id, Vehicle updatedVehicle) {
//         Vehicle existingVehicle = vehicleRepository.findById(id).orElse(null);
//         if (existingVehicle != null) {
//             // Update fields based on your requirements
//             existingVehicle.setVid(updatedVehicle.getVid());
//             existingVehicle.setModel_year(updatedVehicle.getModel_year());
//             existingVehicle.setManufacturer(updatedVehicle.getManufacturer());
//             existingVehicle.setModel(updatedVehicle.getModel());
//             existingVehicle.setColor(updatedVehicle.getColor());
//             existingVehicle.setMileage(updatedVehicle.getMileage());
//             existingVehicle.setRegistation_number(updatedVehicle.getRegistation_number());
//             existingVehicle.setPrice(updatedVehicle.getPrice());
//             // Update other fields...

//             vehicleRepository.save(existingVehicle);
//         }
//     }

//     @Override
//     public void deleteVehicle(Long id) {
//         vehicleRepository.deleteById(id);
//     }
// }
