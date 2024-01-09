package carinventory.itc.cargarageinventory.repository;

import carinventory.itc.cargarageinventory.entity.Vehicle;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.Optional;

public interface VehicleRepository extends JpaRepository<Vehicle, Integer>, JpaSpecificationExecutor<Vehicle> {

    Optional<Vehicle> findById(int id);

    // @Query("SELECT v FROM Vehicle v WHERE (:modelYear IS NULL OR v.modelYear =
    // :modelYear) OR (:manufacturer IS NULL OR v.manufacturer = :manufacturer) AND
    // (:model IS NULL OR v.model = :model) AND (:color IS NULL OR v.color =
    // :color)")
    // List<Vehicle> searchVehicles(
    // @Param("modelYear") Integer modelYear,
    // @Param("manufacturer") String manufacturer,
    // @Param("model") String model,
    // @Param("color") String color);

}
