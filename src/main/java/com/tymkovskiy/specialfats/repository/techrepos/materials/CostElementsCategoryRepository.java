package com.tymkovskiy.specialfats.repository.techrepos.materials;

import com.tymkovskiy.specialfats.model.tech.materials.CostElementsCategory;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CostElementsCategoryRepository extends CrudRepository<CostElementsCategory, Integer> {
}
