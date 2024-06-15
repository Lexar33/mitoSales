package org.jalcantararivera.mitosales.controller;

import org.jalcantararivera.mitosales.model.Category;
import org.jalcantararivera.mitosales.service.ICategoryService;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.List;


import static org.hamcrest.Matchers.hasSize;
import static org.modelmapper.internal.bytebuddy.matcher.ElementMatchers.is;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(CategoryController.class)
public class CategoryControllerTest {

     @Autowired
     private MockMvc mockMvc;

     @MockBean
     private ICategoryService service;

     @MockBean(name="categoryMapper")
     private ModelMapper modelMapper;

     Category CATEGORY_1 = new Category(1,"TV","Television",true);
    Category CATEGORY_2 = new Category(2,"PSP","Play Station",true);
    Category CATEGORY_3 = new Category(3,"BOOKS","Some books",true);

    @Test
    void readAllTest() throws Exception{

        List<Category> categories = List.of(CATEGORY_1,CATEGORY_2,CATEGORY_3);
        Mockito.when(service.readAll()).thenReturn(categories);

        mockMvc.perform(MockMvcRequestBuilders
                .get("/categories")
                .content(MediaType.APPLICATION_JSON_VALUE))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$",hasSize(3)))
                .andExpect(jsonPath("$[1].nameofCategory",is("PSP")));
    }

}
