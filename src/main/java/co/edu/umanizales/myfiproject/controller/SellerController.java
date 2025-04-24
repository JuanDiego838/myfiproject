package co.edu.umanizales.myfiproject.controller;

import co.edu.umanizales.myfiproject.model.Location;
import co.edu.umanizales.myfiproject.model.Seller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path= "seller")

public class SellerController {
    @RequestMapping
    public Seller seller() {
        Location manizales = new Location("105", "Manizales");
        Location medellin = new Location("103", "Medellin");

        Seller santiago = new Seller("Santiago","254587","Giraldo",'M',(byte) 28, manizales);
        Seller paola = new Seller("Paola","154520","Gomez",'F', (byte) 32,medellin);
        Seller julian = new Seller("Julian","152456","Levis", 'M', (byte) 36, manizales);
        Seller valeria = new Seller("Valeria","154785","Arco",'F',(byte) 25, medellin);
        Seller luis = new Seller("Luis", "458795", "Perez",'M',(byte) 30, medellin);

        return julian;

    }
}


