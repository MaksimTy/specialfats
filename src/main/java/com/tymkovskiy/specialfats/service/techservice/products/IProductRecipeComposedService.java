package com.tymkovskiy.specialfats.service.techservice.products;

import com.tymkovskiy.specialfats.model.tech.products.ProductRecipeComposed;

import java.util.List;

public interface IProductRecipeComposedService {

    List<ProductRecipeComposed> findAll();

    ProductRecipeComposed save(ProductRecipeComposed productRecipeComposed);
}
