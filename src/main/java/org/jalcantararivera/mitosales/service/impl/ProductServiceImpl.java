package org.jalcantararivera.mitosales.service.impl;

import lombok.RequiredArgsConstructor;
import org.jalcantararivera.mitosales.model.Product;
import org.jalcantararivera.mitosales.repo.IGenericRepo;
import org.jalcantararivera.mitosales.repo.IProductRepo;
import org.jalcantararivera.mitosales.service.IProductService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl extends GenericServiceImpl<Product,Integer> implements IProductService {

    private final IProductRepo repo;
    @Override
    protected IGenericRepo<Product, Integer> getRepo() {
        return repo;
    }


}
