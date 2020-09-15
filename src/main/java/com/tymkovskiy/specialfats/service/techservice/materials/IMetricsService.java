package com.tymkovskiy.specialfats.service.techservice.materials;

import com.tymkovskiy.specialfats.model.tech.materials.CostElements;
import com.tymkovskiy.specialfats.model.tech.materials.Metrics;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public interface IMetricsService {

    List<Metrics> findAll();

    Metrics save(Metrics metrics) throws SQLException;

    boolean existsById(Integer id);

    Optional<Metrics> findById(Integer id);

    Metrics update(Metrics metrics);

    Metrics findByMaterials(CostElements costElements);

}
