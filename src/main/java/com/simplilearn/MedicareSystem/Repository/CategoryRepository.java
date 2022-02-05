package com.simplilearn.MedicareSystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.simplilearn.MedicareSystem.Model.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer>{

}
