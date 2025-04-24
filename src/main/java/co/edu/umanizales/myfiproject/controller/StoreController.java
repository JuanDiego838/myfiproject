package co.edu.umanizales.myfiproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(path = "/store" )

    public class

StoreController {
    @GetMapping
    public String store() {
        return "store";
    }


}
