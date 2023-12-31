package org.example.shoppingbackendapi.controller;

import org.example.shoppingbackendapi.model.Order;
import org.example.shoppingbackendapi.model.Product;
import org.example.shoppingbackendapi.service.OrderService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }


    @PostMapping("/add")
    public ResponseEntity<String> purchase(@RequestBody List<Order> orders) {
        try {
            orderService.saveAll(orders);
            return ResponseEntity.status(HttpStatus.CREATED).body("Order added successfully");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error adding order");
        }
    }
}
