package com.cosenza.dscommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cosenza.dscommerce.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {



}
