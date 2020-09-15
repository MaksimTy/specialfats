package com.tymkovskiy.specialfats.service.techservice.products;

import com.tymkovskiy.specialfats.model.tech.products.ProductLine;
import com.tymkovskiy.specialfats.repository.techrepos.products.ProductLineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductLineService implements IProductLineService {

    private ProductLineRepository repository;

    @Autowired
    public void setRepository(ProductLineRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<ProductLine> findAll() {
        return (List<ProductLine>) repository.findAll();
    }

    @Override
    public ProductLine save(ProductLine productLine) {
        return repository.save(productLine);
    }
}
