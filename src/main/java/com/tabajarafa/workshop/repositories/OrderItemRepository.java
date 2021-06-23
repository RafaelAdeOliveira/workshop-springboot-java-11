package com.tabajarafa.workshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tabajarafa.workshop.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}