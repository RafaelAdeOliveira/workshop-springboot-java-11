package com.tabajarafa.workshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tabajarafa.workshop.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}