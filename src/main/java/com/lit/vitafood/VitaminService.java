package com.lit.vitafood;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VitaminService {

    @Autowired
    private VitaminRepository vitaminRepository;

    public List<Vitamin> findAll() {
        return (List<Vitamin>) vitaminRepository.findAll();
    }

    public void create(Vitamin vitamin) {
        vitaminRepository.save(vitamin);
    }

    public Optional<Vitamin> findById(long id) {
        return vitaminRepository.findById(id);
    }
}
