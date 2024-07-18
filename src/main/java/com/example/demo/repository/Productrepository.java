package com.example.demo.repository;

import com.example.demo.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Productrepository extends JpaRepository<Product,Integer> {

    Product findByName(String name);
}