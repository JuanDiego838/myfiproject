package co.edu.umanizales.myfiproject.controller;

import co.edu.umanizales.myfiproject.model.Location;
import co.edu.umanizales.myfiproject.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;


@RestController
@RequestMapping (path = "/location ")
public class LocationController {


    @Autowired
    private LocationService LocationService;

    @GetMapping
public List<Location> getLocations ()
    {
        return LocationService.getLocations();
    }

    @GetMapping (path = "/{code}")
public Location getLocationsBycode (@PathVariable String code){
    return locationService.getLocationBycode (code);
    }

    @GetMapping (path = "/states")
    public List<Location> getLocationsByStates (){
        return locationService.getStates();
    }

}