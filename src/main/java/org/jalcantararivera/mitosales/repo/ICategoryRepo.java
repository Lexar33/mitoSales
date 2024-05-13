package org.jalcantararivera.mitosales.repo;

import org.jalcantararivera.mitosales.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ICategoryRepo extends IGenericRepo<Category,Integer> {
    //public Category getCategoryX(Category category);

    //@Query("FROM Product p WHERE p.category.name IS NOT('')")
}
