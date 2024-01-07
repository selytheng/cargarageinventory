package carinventory.itc.cargarageinventory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

import carinventory.itc.cargarageinventory.entity.Vehicle;

@Repository
public interface VehicleRepository extends CrudRepository<Vehicle, Integer> {
    // You can add custom queries or methods if needed
}
