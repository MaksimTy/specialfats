package com.tymkovskiy.specialfats.repository.techrepos.products;

import com.tymkovskiy.specialfats.model.tech.products.ProductLine;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductLineRepository extends CrudRepository<ProductLine, Integer> {
}
