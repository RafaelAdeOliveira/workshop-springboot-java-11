package com.tabajarafa.workshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tabajarafa.workshop.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}