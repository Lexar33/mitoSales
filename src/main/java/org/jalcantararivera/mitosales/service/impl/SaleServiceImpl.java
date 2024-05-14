package org.jalcantararivera.mitosales.service.impl;

import lombok.RequiredArgsConstructor;
import org.jalcantararivera.mitosales.model.Sale;
import org.jalcantararivera.mitosales.repo.IGenericRepo;
import org.jalcantararivera.mitosales.repo.ISaleRepo;
import org.jalcantararivera.mitosales.service.ISaleService;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SaleServiceImpl extends GenericServiceImpl<Sale,Integer> implements ISaleService {

    private final ISaleRepo repo;
    @Override
    protected IGenericRepo<Sale, Integer> getRepo() {
        return repo;
    }


}

