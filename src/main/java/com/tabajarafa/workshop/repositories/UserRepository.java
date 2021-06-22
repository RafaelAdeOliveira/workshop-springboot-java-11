package com.tabajarafa.workshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tabajarafa.workshop.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
