package com.tymkovskiy.specialfats.service.techservice.products;

import com.tymkovskiy.specialfats.model.tech.products.ProductGroup;

import java.util.List;

public interface IProductGroupService {

    List<ProductGroup> findAll();

    ProductGroup save(ProductGroup productGroup);
}
