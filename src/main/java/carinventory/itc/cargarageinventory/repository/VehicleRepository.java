package carinventory.itc.cargarageinventory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import carinventory.itc.cargarageinventory.entity.Vehicle;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Long> {
    // You can add custom queries or methods if needed
}
