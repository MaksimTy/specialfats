package com.tymkovskiy.specialfats.service.techservice.materials;

import com.tymkovskiy.specialfats.model.tech.materials.CostElements;
import com.tymkovskiy.specialfats.model.tech.materials.Metrics;
import com.tymkovskiy.specialfats.repository.techrepos.materials.CostElementsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CostElementsService implements ICostElementsService {

    private CostElementsRepository repository;

    @Autowired
    public void setRepository(CostElementsRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<CostElements> findAll() {
        return (List<CostElements>) repository.findAll();
    }

    @Override
    public List<CostElements> findAllByMetrics(Metrics metrics) {
        return repository.findAllByMetrics(metrics);
    }
}
