package com.tymkovskiy.specialfats.repository.techrepos.materials;

import com.tymkovskiy.specialfats.model.tech.materials.MaterialQualityLevel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MaterialQualityLevelRepository extends CrudRepository<MaterialQualityLevel, Integer> {
}
