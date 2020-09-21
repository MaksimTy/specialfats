package com.tymkovskiy.specialfats.repository.techrepos.products;

import com.tymkovskiy.specialfats.model.tech.products.CompositeKeyRecipeComposed;
import com.tymkovskiy.specialfats.model.tech.products.ProductRecipeComposed;
import org.springframework.data.repository.CrudRepository;

public interface ProductRecipeComposedRepository
        extends CrudRepository<ProductRecipeComposed, CompositeKeyRecipeComposed> {
}
