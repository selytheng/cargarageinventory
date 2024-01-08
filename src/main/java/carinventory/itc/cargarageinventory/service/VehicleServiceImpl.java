package carinventory.itc.cargarageinventory.service;

import carinventory.itc.cargarageinventory.entity.Vehicle;
import carinventory.itc.cargarageinventory.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
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

    // Add the following method to the VehicleServiceImpl class

    @Override
    public List<Vehicle> searchVehicles(String search) {
        Specification<Vehicle> spec = (root, query, criteriaBuilder) -> {
            if (search == null || search.isEmpty()) {
                return null; // No filtering if search is empty
            }

            // Use a custom query to search across multiple fields
            return criteriaBuilder.or(
                    criteriaBuilder.like(criteriaBuilder.lower(root.get("model_year").as(String.class)),
                            "%" + search.toLowerCase() + "%"),
                    criteriaBuilder.like(criteriaBuilder.lower(root.get("manufacturer")),
                            "%" + search.toLowerCase() + "%"),
                    criteriaBuilder.like(criteriaBuilder.lower(root.get("model")), "%" + search.toLowerCase() + "%"),
                    criteriaBuilder.like(criteriaBuilder.lower(root.get("color")), "%" + search.toLowerCase() + "%"),
                    criteriaBuilder.like(criteriaBuilder.lower(root.get("mileage")), "%" + search.toLowerCase() + "%"),
                    criteriaBuilder.like(criteriaBuilder.lower(root.get("registation_number")),
                            "%" + search.toLowerCase() + "%"));
        };

        return vehicleRepository.findAll(spec);
    }
}