package carinventory.itc.cargarageinventory.controller;

import carinventory.itc.cargarageinventory.entity.IncreaseStockForm;
import carinventory.itc.cargarageinventory.entity.UserForm;
import carinventory.itc.cargarageinventory.entity.Vehicle;
import carinventory.itc.cargarageinventory.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/vehicles")
public class VehicleController {

    @Autowired
    private VehicleService vehicleService;

    // @GetMapping("/list")
    // public String listVehicles(Model model) {
    // List<Vehicle> vehicles = vehicleService.getAllVehicles();
    // model.addAttribute("vehicles", vehicles);
    // return "vehicle/list";
    // }

    @GetMapping("/showFormForAdd")
    public String showFormForAdd(Model model) {
        Vehicle vehicle = new Vehicle();
        model.addAttribute("vehicle", vehicle);
        return "vehicle/add-form";
    }

    @PostMapping("/saveVehicle")
    public String saveVehicle(@ModelAttribute("vehicle") Vehicle vehicle) {
        vehicleService.saveOrUpdateVehicle(vehicle);
        return "redirect:/vehicles/list";
    }

    @GetMapping("/showFormForUpdate")
    public String showFormForUpdate(@RequestParam("vid") int vid, Model model) {
        Vehicle vehicle = vehicleService.getVehicleById(vid);
        model.addAttribute("vehicle", vehicle);
        return "vehicle/add-form";
    }

    @GetMapping("/delete")
    public String deleteVehicle(@RequestParam("vid") int vid) {
        vehicleService.deleteVehicle(vid);
        return "redirect:/vehicles/list";
    }

    // Update the listVehicles method in VehicleController

    @GetMapping("/list")
    public String listVehicles(@RequestParam(required = false) String search, Model model) {
        List<Vehicle> vehicles;

        // Perform a filtered search based on the provided search parameter
        vehicles = vehicleService.searchVehicles(search);

        model.addAttribute("vehicles", vehicles);
        return "vehicle/list";
    }

    @GetMapping("/showFormForIncreaseStock")
    public String showFormForIncreaseStock(Model model) {
        model.addAttribute("increaseStockForm", new IncreaseStockForm());
        return "vehicle/increase-stock";
    }

    @PostMapping("/increaseStock")
    public String increaseStock(@ModelAttribute("increaseStockForm") IncreaseStockForm form) {
        vehicleService.increaseStock(form.getVid(), form.getQuantity());
        return "redirect:/vehicles/list";
    }
}
