package com.tymkovskiy.specialfats.repository.techrepos.materials;

import com.tymkovskiy.specialfats.model.tech.materials.CostElements;
import com.tymkovskiy.specialfats.model.tech.materials.Metrics;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CostElementsRepository extends CrudRepository<CostElements, Integer> {

    List<CostElements> findAllByMetrics(Metrics metrics);
}
