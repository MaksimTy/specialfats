package com.tymkovskiy.specialfats.service.techservice.materials;

import com.tymkovskiy.specialfats.model.tech.materials.CostElementsCategory;
import com.tymkovskiy.specialfats.repository.techrepos.materials.CostElementsCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CostElementsCategoryService implements ICostElementsCategoryService {

    private CostElementsCategoryRepository repository;

    @Autowired
    public void setRepository(CostElementsCategoryRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<CostElementsCategory> findAll() {
        return (List<CostElementsCategory>) repository.findAll();
    }
}
