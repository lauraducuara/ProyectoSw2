package com.example.backendsw2.usecase.registry;

import com.example.backendsw2.adapter.repository.RegistryRepository;
import com.example.backendsw2.domain.dto.RegistryDto;
import com.example.backendsw2.usecase.validator.RegistryValidator;

public class CreateRegistryUseCase {


    private RegistryRepository registryRepository;



    public CreateRegistryUseCase(RegistryRepository registryRepository){
        this.registryRepository = registryRepository;
    }
    public void execute(RegistryDto dto) {
        // validar informacion de usuario
        RegistryValidator.validateInputDto(dto);
        // validar que el usuario no exista
      /*  if(this.registryRepository.existsRegistry(dto.getIdStudent()).intValue() > 0)
            throw new ClassException("La matricula de este estudiante ya existe");
        // convertir dto a entidad
        Registry registry = RegistryMapper.INSTANCE.toEntity(dto);
        // guardar usuario
        this.registryRepository.save(registry);
*/
    }

}
