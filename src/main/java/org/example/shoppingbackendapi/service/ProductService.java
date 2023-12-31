package org.example.shoppingbackendapi.service;

import org.example.shoppingbackendapi.model.Order;
import org.example.shoppingbackendapi.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductService extends JpaRepository<Product, Integer> {
}
