package com.matias.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.matias.example.entity.Product;

public interface ProductoRepository extends JpaRepository<Product,Long>{ }
