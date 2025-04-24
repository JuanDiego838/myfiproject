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
        return LocationService.getLocationsCode(code);
    }

    @GetMapping(path = "/states")
    public List<Location> getLocationsStates(){
        return LocationService.getStates();
    }

    @GetMapping("/capitals")
    public List<Location> getCapitals() {
        return LocationService.getCapitals();
    }

    @GetMapping("/letters/{letters}")
    public List<Location> getLocationsInitialLetters(@PathVariable String letters) {
        return LocationService.getLocationsInitialLetters(letters);
    }

    @GetMapping("/name/{name}")
    public Location getLocationName(@PathVariable String name) {
        return LocationService.getLocationName(name);
    }

    @GetMapping("/states/{code}")
    public Location getStateCode(@PathVariable String code) {
        return LocationService.getStateCode(code);
    }

    @GetMapping("/locations/state/{stateCode}")
    public List<Location> getLocationsStateCode(@PathVariable String stateCode) {
        return LocationService.getLocationsStateCode(stateCode);
    }

    @GetMapping("/states-capitals")
    public List<Location> getDepartmentsWithCapitals() {
        return LocationService.getDepartmentsWithCapitals();
    }

}






