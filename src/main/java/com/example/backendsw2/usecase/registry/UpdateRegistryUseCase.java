package com.example.backendsw2.usecase.registry;


import com.example.backendsw2.adapter.repository.RegistryRepository;
import com.example.backendsw2.domain.dto.RegistryDto;

public class UpdateRegistryUseCase {

    private RegistryRepository registryRepository;

    public UpdateRegistryUseCase(RegistryRepository registryRepository) {
        this.registryRepository = registryRepository;
    }

    public void execute(RegistryDto dto) {
      /*  // Verificar que el usuario exista
        Registry existingRegistry = registryRepository.findRegistryById(dto.getIdStudent());
        if (existingRegistry == null) {
            throw new ClassException("Usuario no encontrado");
        }

        // Validar información del usuario
        RegistryValidator.validateInputDto(dto);

        // Verificar si el nuevo nombre de usuario ya está en uso por otro usuario
        // Verificar si el nuevo nombre de usuario ya está en uso por otro usuario
        if (existingRegistry.getIdStudent() == dto.getIdStudent()
                && registryRepository.existRegistryL(Long.valueOf(dto.getIdStudent().toString().trim()))) {
            throw new ClassException("Ese estudiante ya esta en uso");
        }

        // Actualizar los campos del registry existente
        existingRegistry.setTypeRegistry(dto.getTypeRegistry());
        existingRegistry.setNameCourse(dto.getNameCourse());
        existingRegistry.setIdStudent(dto.getIdStudent());
        existingRegistry.setNameStudent(dto.getNameStudent());
        existingRegistry.setLastNameStudent(dto.getLastNameStudent());
        existingRegistry.setStatusRegistry(dto.getStatusRegistry());

        // Guardar los cambios en el repositorio
       // registryRepository.updateRegistry(existingRegistry);*/
    }
}
