package com.tymkovskiy.specialfats.service.techservice.materials;

import com.tymkovskiy.specialfats.model.tech.materials.CostElementsCategory;

import java.util.List;

public interface ICostElementsCategoryService {

    List<CostElementsCategory> findAll();
}
