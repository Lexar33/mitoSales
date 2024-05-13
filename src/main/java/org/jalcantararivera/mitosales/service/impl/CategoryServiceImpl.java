package org.jalcantararivera.mitosales.service.impl;

import lombok.RequiredArgsConstructor;
import org.jalcantararivera.mitosales.model.Category;
import org.jalcantararivera.mitosales.repo.ICategoryRepo;
import org.jalcantararivera.mitosales.repo.IGenericRepo;
import org.jalcantararivera.mitosales.service.ICategoryService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl extends GenericServiceImpl<Category,Integer> implements ICategoryService {

    private final ICategoryRepo repo;

    @Override
    protected IGenericRepo<Category, Integer> getRepo() {
        return repo;
    }


    //@Autowired
    //private CategoryRepo repo;
    //INYECCION POR CONSTRUCTOR
    /*
    public CategoryService(CategoryRepo repo){
        this.repo = repo;
    }
    */

    /*
    public Category validateCategory(Category category){
        //repo = new CategoryRepo();

        if(category.getIdCategory() != 0){
            return repo.getCategoryX(category);
        } else {
            return new Category();

        }
    }
    */

    /*
    @Override
    public Category save(Category category) throws Exception {
        return repo.save(category);
    }

    @Override
    public Category update(Category category, Integer id) throws Exception {
        //VALIDACIONES MAS ADELANTE
        category.setIdCategory(id);
        return repo.save(category);
    }

    @Override
    public List<Category> readAll() throws Exception {
        return repo.findAll();
    }

    @Override
    public Category readById(Integer id) throws Exception {
        return repo.findById(id).orElse(new Category());
    }

    @Override
    public void delete(Integer id) throws Exception {
        repo.deleteById(id);
    }
    */
}