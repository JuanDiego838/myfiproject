package co.edu.umanizales.myfiproject.controller;

import co.edu.umanizales.myfiproject.model.Location;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping (path ="/location")

public class LocationController {
    @RequestMapping
    public String getLocation(){
        return "esta bien";
    }

}
