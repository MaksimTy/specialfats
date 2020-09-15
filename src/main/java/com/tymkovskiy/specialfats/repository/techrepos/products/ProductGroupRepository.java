package com.tymkovskiy.specialfats.repository.techrepos.products;

import com.tymkovskiy.specialfats.model.tech.products.ProductGroup;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductGroupRepository extends CrudRepository<ProductGroup, Integer> {
}
