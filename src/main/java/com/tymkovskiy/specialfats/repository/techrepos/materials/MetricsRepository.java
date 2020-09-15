package com.tymkovskiy.specialfats.repository.techrepos.materials;

import com.tymkovskiy.specialfats.model.tech.materials.CostElements;
import com.tymkovskiy.specialfats.model.tech.materials.Metrics;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MetricsRepository extends CrudRepository<Metrics, Integer> {

    Metrics findByMaterials(CostElements costElements);
}
