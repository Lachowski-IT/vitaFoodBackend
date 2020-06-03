package com.lit.vitafood;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class VitaminController {

    @Autowired
    private VitaminService vitaminService;

    @GetMapping("/vitamin")
    public List<Vitamin> getVitamins() {
        return vitaminService.findAll();
    }

    @PostMapping("/vitamin")
    void addVitamin(@RequestBody Vitamin vitamin) {
        vitaminService.create(vitamin);
    }

}
