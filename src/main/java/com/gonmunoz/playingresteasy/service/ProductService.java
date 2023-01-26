package com.gonmunoz.playingresteasy.service;

import com.gonmunoz.playingresteasy.model.Product;

import java.util.List;

public interface ProductService {
    Product save(Product product);
    Product update(Product product);
    List<Product> listAll();
    Product findById(Integer id);
    void delete(Integer id);
}
