package org.jalcantararivera.mitosales.controller;


import lombok.RequiredArgsConstructor;
import org.jalcantararivera.mitosales.model.Category;
import org.jalcantararivera.mitosales.repo.ICategoryRepo;
import org.jalcantararivera.mitosales.service.CategoryServiceImpl;
import org.jalcantararivera.mitosales.service.ICategoryService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

import java.util.List;

@RestController
@RequestMapping("/categories")
@RequiredArgsConstructor
public class CategoryController {

    //private final CategoryServiceImpl service;
    private final ICategoryService service;
    //@Autowired
    //private CategoryService service;

    //INYECCION POR CONSTRUCTOR
    /*
    public CategoryController(CategoryService service){

        this.service=service;
    }
    */
    /*
    @GetMapping
    public Category getCategorySimple(){
        //service= new CategoryService();
        return service.validateCategory(new Category(1,"TV","Television",true));
    }
    */
    @GetMapping
    public ResponseEntity<List<Category>>  readAll() throws  Exception{
        List<Category>list=service.readAll();
        return ResponseEntity.ok(list);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Category> readById(@PathVariable("id") Integer id) throws Exception{
        Category obj= service.readById(id);
        return ResponseEntity.ok(obj);
    }
    @PostMapping
    public ResponseEntity<Category> save(@RequestBody Category category) throws  Exception{
        Category obj= service.save(category);
        return new ResponseEntity<>(obj, HttpStatus.CREATED);
        //return new ResponseEntity.created();
    }
     @PutMapping("/{id}")
    public ResponseEntity<Category> update(@RequestBody Category category,@PathVariable("id") Integer id ) throws Exception{
        Category obj= service.update(category,id);
        return ResponseEntity.ok(obj);
     }

     @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") Integer id ) throws Exception{
        service.delete(id);
        //return ResponseEntity.noContent().build();
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }



}
