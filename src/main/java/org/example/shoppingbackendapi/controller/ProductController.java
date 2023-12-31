package org.example.shoppingbackendapi.controller;

import org.example.shoppingbackendapi.model.Order;
import org.example.shoppingbackendapi.model.Product;
import org.example.shoppingbackendapi.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping()
    public List<Product> GetAllStudents() {
        return productService.findAll();
    }


    @GetMapping("{id}")
    public Product GetById(@PathVariable int id) {
        return productService.findById(id).orElse(null);
    }

}
