package org.jalcantararivera.mitosales.service;

import lombok.RequiredArgsConstructor;
import org.jalcantararivera.mitosales.model.Category;
import org.jalcantararivera.mitosales.repo.CategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CategoryService {

    private final CategoryRepo repo;
    //@Autowired
    //private CategoryRepo repo;
    //INYECCION POR CONSTRUCTOR
    /*
    public CategoryService(CategoryRepo repo){
        this.repo = repo;
    }
    */


    public Category validateCategory(Category category){
        //repo = new CategoryRepo();

        if(category.getIdCategory() != 0){
            return repo.getCategoryX(category);
        } else {
            return new Category();

        }
    }

}
