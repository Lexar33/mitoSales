package org.jalcantararivera.mitosales.repo;

import org.jalcantararivera.mitosales.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICategoryRepo extends JpaRepository<Category,Integer> {
    //public Category getCategoryX(Category category);
}
