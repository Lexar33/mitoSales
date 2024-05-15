package org.jalcantararivera.mitosales.service;
 import org.jalcantararivera.mitosales.model.Category;
 import org.jalcantararivera.mitosales.repo.IGenericRepo;

 import java.util.List;

public interface ICategoryService extends IGenericService<Category,Integer> {
/*
    Category save(Category category) throws Exception;
    Category update(Category category, Integer id ) throws Exception;
    List<Category> readAll() throws Exception;
    Category readById(Integer id ) throws Exception;
    void delete(Integer id) throws Exception;
*/
  List<Category> findByNameService(String name);
  List<Category> findByNameAndEnabledService(String name,boolean enabled);
  List<Category> getByNameAndDescriptionService(String name,String description);

}
