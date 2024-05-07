package org.jalcantararivera.mitosales.repo;

import org.jalcantararivera.mitosales.model.Category;
import org.springframework.aot.hint.annotation.RegisterReflectionForBinding;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/*ESTEREOTIPO*/
//@Repository // Acceso a base de datos
//@Service // Logica de negocio
//@Controller // No usado
//@Component // Lo que no es Repository o Service

@Repository
public class CategoryRepo {

    public Category getCategoryX(Category category){
        return category;
    }

}
