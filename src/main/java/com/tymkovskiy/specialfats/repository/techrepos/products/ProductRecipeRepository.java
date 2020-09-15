package com.tymkovskiy.specialfats.repository.techrepos.products;

import com.tymkovskiy.specialfats.model.tech.products.CompositeKeyRecipe;
import com.tymkovskiy.specialfats.model.tech.products.ProductRecipe;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRecipeRepository extends CrudRepository<ProductRecipe, CompositeKeyRecipe> {
}
