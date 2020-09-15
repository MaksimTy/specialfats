package com.tymkovskiy.specialfats.service.techservice.products;

import com.tymkovskiy.specialfats.model.tech.products.ProductLine;

import java.util.List;

public interface IProductLineService {

    List<ProductLine> findAll();

    ProductLine save(ProductLine productLine);
}
