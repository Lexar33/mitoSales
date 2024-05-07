package org.jalcantararivera.mitosales.controller;


import lombok.RequiredArgsConstructor;
import org.jalcantararivera.mitosales.model.Category;
import org.jalcantararivera.mitosales.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/categories")
@RequiredArgsConstructor
public class CategoryController {

    private final CategoryService service;
    //@Autowired
    //private CategoryService service;

    //INYECCION POR CONSTRUCTOR
    /*
    public CategoryController(CategoryService service){

        this.service=service;
    }
    */

    @GetMapping
    public Category getCategorySimple(){
        //service= new CategoryService();
        return service.validateCategory(new Category(1,"TV","Television",true));
    }









}
