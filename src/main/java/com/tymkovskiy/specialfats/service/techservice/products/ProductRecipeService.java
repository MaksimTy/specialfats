package com.tymkovskiy.specialfats.service.techservice.products;

import com.tymkovskiy.specialfats.model.tech.products.ProductRecipe;
import com.tymkovskiy.specialfats.repository.techrepos.products.ProductRecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductRecipeService implements IProductRecipeService {

    private ProductRecipeRepository repository;

    @Autowired
    public void setRepository(ProductRecipeRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<ProductRecipe> findAll() {
        return (List<ProductRecipe>) repository.findAll();
    }

    @Override
    public ProductRecipe save(ProductRecipe productRecipe) {
        return repository.save(productRecipe);
    }
}
