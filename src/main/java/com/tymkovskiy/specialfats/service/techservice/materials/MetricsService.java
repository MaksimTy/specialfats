package com.tymkovskiy.specialfats.service.techservice.materials;

import com.tymkovskiy.specialfats.model.tech.materials.CostElements;
import com.tymkovskiy.specialfats.model.tech.materials.Metrics;
import com.tymkovskiy.specialfats.repository.techrepos.materials.MetricsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

@Service
public class MetricsService implements IMetricsService {

    private MetricsRepository repository;

    @Autowired
    public void setRepository(MetricsRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Metrics> findAll() {
        return (List<Metrics>) repository.findAll();
    }

    @Override
    public Metrics save(Metrics metrics) throws SQLException {
        Metrics result = null;
        if (repository.existsById(metrics.getId())) {
            String message = String.format("Entry with id '%s' is exist!", metrics.getCode());
            throw new IllegalArgumentException(message);
        }
        if (metrics.getCode().isEmpty()
                || metrics.getCodename().isEmpty()
                || metrics.getName().isEmpty()) {
            String message = "Entry fields must not be empty!";
            throw new IllegalArgumentException(message);
        }
        try {
            result = repository.save(metrics);
        } catch (Exception e) {
            String message = "Could not execute statement!";
            throw new SQLException(message);
        }
        // result = repository.save(metrics);
        return result;
    }

    @Override
    public Metrics update(Metrics metrics) {
        if (metrics.getCode().isEmpty()
                || metrics.getCodename().isEmpty()
                || metrics.getName().isEmpty()) {
            String message = "Entry fields must not be empty!";
            throw new IllegalArgumentException(message);
        }
        return repository.save(metrics);
    }

    @Override
    public boolean existsById(Integer id) {
        return repository.existsById(id);
    }

    @Override
    public Optional<Metrics> findById(Integer id) {
        return repository.findById(id);
    }

    @Override
    public Metrics findByMaterials(CostElements costElements) {
        return repository.findByMaterials(costElements);
    }
}
