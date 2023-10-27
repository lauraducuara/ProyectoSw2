package com.example.backendsw2.usecase.registry;


import com.example.backendsw2.adapter.repository.RegistryRepository;

public class DeleteRegistryUseCase {


    private RegistryRepository registryRepository;

    public  DeleteRegistryUseCase(RegistryRepository registryRepository) {
        this.registryRepository = registryRepository;
    }

    public void execute(Long id){
       /* if(!registryRepository.existRegistryL(id)){
            throw new RuntimeException("Registro no se encuentra");
        }
        this.registryRepository.deleteRegistryById(id);*/
    }
}
