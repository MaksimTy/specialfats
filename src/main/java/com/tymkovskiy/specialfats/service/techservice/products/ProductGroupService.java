package com.tymkovskiy.specialfats.service.techservice.products;

import com.tymkovskiy.specialfats.model.tech.products.ProductGroup;
import com.tymkovskiy.specialfats.repository.techrepos.products.ProductGroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductGroupService implements IProductGroupService {

    private ProductGroupRepository repository;

    @Autowired
    public void setRepository(ProductGroupRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<ProductGroup> findAll() {
        return (List<ProductGroup>) repository.findAll();
    }

    @Override
    public ProductGroup save(ProductGroup productGroup) {
        return repository.save(productGroup);
    }
}
