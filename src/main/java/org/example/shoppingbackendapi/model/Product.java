package org.example.shoppingbackendapi.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int product_id;

    private String name;

    private double price;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;

}
