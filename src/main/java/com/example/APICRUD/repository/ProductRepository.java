package com.example.APICRUD.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.APICRUD.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

	Product findByName(String name);

}
