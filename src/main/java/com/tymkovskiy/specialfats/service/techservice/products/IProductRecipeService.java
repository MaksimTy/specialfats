package com.tymkovskiy.specialfats.service.techservice.products;

import com.tymkovskiy.specialfats.model.tech.products.ProductRecipe;

import java.util.List;

public interface IProductRecipeService {

    List<ProductRecipe> findAll();

    ProductRecipe save(ProductRecipe productRecipe);
}
