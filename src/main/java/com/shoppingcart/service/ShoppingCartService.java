package com.shoppingcart.service;

import com.shoppingcart.exception.NotEnoughProductsInStockException;
import com.shoppingcart.model.Product;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

public interface ShoppingCartService {

    void addProduct(Product product);

    void removeProduct(Product product);

    Map<Product, Integer> getProductsInCart();

    void checkout() throws NotEnoughProductsInStockException;

    BigDecimal getTotal();

    public Iterable<Product> list();

    public Product save(Product product);

    public Iterable<Product> save(List<Product> products);

    BigDecimal getDiscount();
}
