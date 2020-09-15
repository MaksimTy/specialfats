package com.tymkovskiy.specialfats.service.techservice.materials;

import com.tymkovskiy.specialfats.model.tech.materials.CostElements;
import com.tymkovskiy.specialfats.model.tech.materials.Metrics;

import java.util.List;

public interface ICostElementsService {

    List<CostElements> findAll();

    List<CostElements> findAllByMetrics(Metrics metrics);

}
