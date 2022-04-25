package com.webservice.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webservice.demo.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
