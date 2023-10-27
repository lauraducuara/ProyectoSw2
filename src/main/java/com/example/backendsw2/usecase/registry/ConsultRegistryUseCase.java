package com.example.backendsw2.usecase.registry;


import com.example.backendsw2.adapter.repository.RegistryRepository;
import com.example.backendsw2.domain.dto.RegistryDto;
import com.example.backendsw2.domain.entities.Registry;
import com.example.backendsw2.domain.mapper.RegistryMapper;

import java.util.List;

public class ConsultRegistryUseCase {

    private RegistryRepository registryRepository;

    public ConsultRegistryUseCase(RegistryRepository registryRepository) {
        this.registryRepository = registryRepository;
    }

    public List<RegistryDto> execute() {
        List<Registry> registry = registryRepository.findAll();
        List<RegistryDto> listReg = RegistryMapper.INSTANCE.toDto(registry);

        return listReg;
    }

}