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

    @GetMapping("/vitamin/{id}")
    public Vitamin getVitamin(@PathVariable(value = "id") Long id) {
        return vitaminService.findById(id);
    }

    @PostMapping("/vitamin")
    public void create(@RequestBody Vitamin vitamin) {
        vitaminService.create(vitamin);
    }

    @PutMapping("/vitamin/{id}")
    public void update(@PathVariable(value = "id") Long id, @RequestBody Vitamin vitaminDetail) {
        Vitamin vitamin = vitaminService.findById(id);
        vitamin.setName(vitaminDetail.getName());
        vitaminService.update(vitamin);
    }

    @DeleteMapping("/vitamin/{id}")
    public void delete(@PathVariable(value = "id") Long id) {
        System.out.println();
        vitaminService.delete(id);
    }

}
