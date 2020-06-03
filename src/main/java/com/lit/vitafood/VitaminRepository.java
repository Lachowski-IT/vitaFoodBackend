package com.lit.vitafood;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VitaminRepository extends CrudRepository<Vitamin, Long> {
}
