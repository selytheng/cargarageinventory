package carinventory.itc.cargarageinventory.repository;

import carinventory.itc.cargarageinventory.entity.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepository extends JpaRepository<Vehicle, Integer> {
}
