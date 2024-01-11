package carinventory.itc.cargarageinventory.repository;

import carinventory.itc.cargarageinventory.entity.Vehicle;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.Optional;

public interface VehicleRepository extends JpaRepository<Vehicle, Integer>, JpaSpecificationExecutor<Vehicle> {

    Optional<Vehicle> findById(int id);

}
