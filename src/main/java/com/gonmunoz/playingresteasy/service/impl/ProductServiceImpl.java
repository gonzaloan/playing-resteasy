package com.gonmunoz.playingresteasy.service.impl;

import com.gonmunoz.playingresteasy.model.Product;
import com.gonmunoz.playingresteasy.service.ProductService;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ProductServiceImpl implements ProductService {
    private static List<Product> products = Collections.emptyList();
    @Override
    public Product save(Product product) {
        products.add(product);
        return product;
    }
    @Override
    public Product update(Product product) {
        products = products.stream()
                .map(element -> element.getId().equals(product.getId()) ? product : element)
                .collect(Collectors.toList());
        return product;
    }
    @Override
    public List<Product> listAll() {
        return products;
    }

    @Override
    public Product findById(Integer id) {
        return products.stream()
                .filter(element -> element.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("No element with id "+ id +" was found."));
    }

    @Override
    public void delete(Integer id) {
        products.removeIf(element -> element.getId().equals(id));
    }
}
