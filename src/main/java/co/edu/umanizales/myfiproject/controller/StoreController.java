package co.edu.umanizales.myfiproject.controller;

import co.edu.umanizales.myfiproject.model.Store;
import co.edu.umanizales.myfiproject.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/store")
public class StoreController {

    @Autowired
    private StoreService storeService;

    @GetMapping
    public List<Store> getAllStores() {
        return storeService.getAllStores();
    }

    @GetMapping("/{code}")
    public Store getStoreCode(@PathVariable String code) {
        return storeService.getStoreCode(code);
    }


}
