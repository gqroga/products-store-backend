package com.productsstore.demo.repositories;

import com.productsstore.demo.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
