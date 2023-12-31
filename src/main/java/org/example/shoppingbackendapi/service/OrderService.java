package org.example.shoppingbackendapi.service;

import jakarta.transaction.Transactional;
import org.example.shoppingbackendapi.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderService extends JpaRepository<Order, Integer> {
}
