package org.jalcantararivera.mitosales.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/categories")
public class CategoryController {

    @GetMapping
    public String sayHi(){
        return "Hola Coders";
    }
}
