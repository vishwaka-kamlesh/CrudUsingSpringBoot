package com.freshcrud.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.freshcrud.Entity.Product;

public interface ProductRepository extends JpaRepository<Product,Integer>{

	
}
