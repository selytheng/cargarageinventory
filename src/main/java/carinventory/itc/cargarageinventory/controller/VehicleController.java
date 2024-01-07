package carinventory.itc.cargarageinventory.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import carinventory.itc.cargarageinventory.entity.Vehicle;
import carinventory.itc.cargarageinventory.service.VehicleService;

import java.util.List;

@Controller
@RequestMapping("/vehicle")
public class VehicleController {

    @Autowired
    private VehicleService VehicleService;

    // @GetMapping("/vehicle")
    // public String vehiclePage() {
    // return "vehicle"; // Assuming "vehicle" is the name of a Thymeleaf or JSP
    // template
    // }

    @GetMapping("/allvehicles")
    public ResponseEntity<List<Vehicle>> getAllVehicles() {
        List<Vehicle> vehicles = null;
        try {
            vehicles = VehicleService.getAllVehicles();
        } catch (Exception e) {
            e.getMessage();
        }
        return new ResponseEntity<>(vehicles, HttpStatus.OK);
    }

    @GetMapping("/getVehicleById/{vid}")
    public ResponseEntity<Vehicle> getVehicleById(@PathVariable int vid) {
        Vehicle vehicle = null;
        try {
            vehicle = VehicleService.getVehicleById(vid);
        } catch (Exception e) {
            e.getMessage();
        }
        return new ResponseEntity<>(vehicle, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Void> addVehicle(@RequestBody Vehicle vehicle) {
        VehicleService.addVehicle(vehicle);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PutMapping("/updateVehicle/{id}")
    public ResponseEntity<Void> updateVehicle(@PathVariable int id, @RequestBody Vehicle updatedVehicle) {
        VehicleService.updateVehicle(id, updatedVehicle);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("/deleteVehicle/{id}")
    public ResponseEntity<Void> deleteVehicle(@PathVariable int vid) {
        VehicleService.deleteVehicle(vid);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
