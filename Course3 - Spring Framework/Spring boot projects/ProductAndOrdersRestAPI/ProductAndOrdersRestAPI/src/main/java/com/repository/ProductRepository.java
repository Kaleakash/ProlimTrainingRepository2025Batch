package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bean.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{
	// we can write custom method with JPQL query if you need. 
}
