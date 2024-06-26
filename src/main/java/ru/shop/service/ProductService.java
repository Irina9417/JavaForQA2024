package ru.shop.service;

import ru.shop.model.Product;
import ru.shop.model.ProductType;
import ru.shop.repository.ProductRepository;

import java.util.ArrayList;
import java.util.List;

public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    public void save(Product product) {
        productRepository.save(product);
    }
    public List<Product> findAll() {
        return productRepository.findAll();
    }
    public List<Product> findByProductType (ProductType productType) {
        return productRepository.findAll().stream()
                .filter(it -> it.getProductType() == productType)
                .toList();
    }
}
