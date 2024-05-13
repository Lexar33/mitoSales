package org.jalcantararivera.mitosales.service.impl;

import jakarta.validation.constraints.Size;
import lombok.RequiredArgsConstructor;
import org.jalcantararivera.mitosales.model.Provider;
import org.jalcantararivera.mitosales.repo.IGenericRepo;
import org.jalcantararivera.mitosales.repo.IProviderRepo;
import org.jalcantararivera.mitosales.service.IProviderService;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProviderServiceImpl extends GenericServiceImpl<Provider,Integer> implements IProviderService {

    private final IProviderRepo repo;
    @Override
    protected IGenericRepo<Provider, Integer> getRepo() {
        return repo;
    }

}
