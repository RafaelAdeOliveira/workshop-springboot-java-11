package com.tabajarafa.workshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tabajarafa.workshop.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}