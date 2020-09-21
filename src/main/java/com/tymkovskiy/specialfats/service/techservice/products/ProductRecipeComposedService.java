package com.tymkovskiy.specialfats.service.techservice.products;

import com.tymkovskiy.specialfats.model.tech.products.ProductRecipeComposed;
import com.tymkovskiy.specialfats.repository.techrepos.products.ProductRecipeComposedRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductRecipeComposedService implements IProductRecipeComposedService{

    @Autowired
    private ProductRecipeComposedRepository repository;

    @Override
    public List<ProductRecipeComposed> findAll() {
        return (List<ProductRecipeComposed>) repository.findAll();
    }

    @Override
    public ProductRecipeComposed save(ProductRecipeComposed productRecipeComposed) {
        return repository.save(productRecipeComposed);
    }
}
