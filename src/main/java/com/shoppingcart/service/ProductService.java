package com.shoppingcart.service;

import com.shoppingcart.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface ProductService {

    Optional<Product> findById(Long id);

    Page<Product> findAllProductsPageable(Pageable pageable);

    Page<Product> findAllProductsByNamePageable(Pageable pageable, String name);

}
