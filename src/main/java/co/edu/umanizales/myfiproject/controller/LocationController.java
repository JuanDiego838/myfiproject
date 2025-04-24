package co.edu.umanizales.myfiproject.controller;

import co.edu.umanizales.myfiproject.model.Location;
import co.edu.umanizales.myfiproject.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping(path = "/location")
public class LocationController {


    @Autowired
    private LocationService LocationService;

    @GetMapping
    public List<Location> getLocations() {
        return LocationService.getLocations();
    }
    @GetMapping(path = "/{code}")
    public Location getLocation(@PathVariable String code) {
        return LocationService.getLocationsByCode(code);
    }

    @GetMapping(path = "/states")
    public List<Location> getLocationsByStates(){
        return LocationService.getStates();
    }

    @GetMapping("/capitals")
    public List<Location> getCapitals() {
        return LocationService.getCapitals();
    }

    @GetMapping("/letters/{letters}")
    public List<Location> getLocationsByInitialLetters(@PathVariable String letters) {
        return LocationService.getLocationsByInitialLetters(letters);
    }

    @GetMapping("/name/{name}")
    public Location getLocationByName(@PathVariable String name) {
        return LocationService.getLocationByName(name);
    }

    @GetMapping("/states/{code}")
    public Location getStateByCode(@PathVariable String code) {
        return LocationService.getStateByCode(code);
    }

    @GetMapping("/locations/state/{stateCode}")
    public List<Location> getLocationsByStateCode(@PathVariable String stateCode) {
        return LocationService.getLocationsByStateCode(stateCode);
    }


}





