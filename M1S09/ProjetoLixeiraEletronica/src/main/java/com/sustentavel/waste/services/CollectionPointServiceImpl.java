package com.sustentavel.waste.services;

import com.sustentavel.waste.dtos.collectionpoints.CollectionPointMaterialRequestDto;
import com.sustentavel.waste.dtos.collectionpoints.CollectionPointRequestDto;
import com.sustentavel.waste.dtos.collectionpoints.CollectionPointResponseDto;
import com.sustentavel.waste.entidades.CollectionPoint;
import com.sustentavel.waste.entidades.CollectionPointMaterial;
import com.sustentavel.waste.entidades.ElectronicWaste;
import com.sustentavel.waste.errors.exceptions.CollectionPointNotFoundException;
import com.sustentavel.waste.mappers.CollectionPointMapper;
import com.sustentavel.waste.repositories.CollectionPointRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CollectionPointServiceImpl implements CollectionPointService {
    
    // EX02 - Criar CRUD e classe de serviços.
    private final CollectionPointRepository repository;
    private final ElectronicWasteService electronicWasteService;

    @Override 
    public CollectionPointResponseDto create(CollectionPointRequestDto dto) { // EX02 - Criar método para criar um lixo eletrônico. (CRUD - Create)
        CollectionPoint cp = CollectionPointMapper.toEntity(new CollectionPoint, dto); // Utilizar o mapper para converter o DTO em entidade.
        return CollectionPointMapper.toResponseDto(repository.save(cp)); // Salvar a entidade no banco de dados e converter em DTO de resposta.
    }

    @Override
    public List<CollectionPointResponseDto> findAll(){ // EX02 - Criar método para buscar todos os lixos eletrônicos. (CRUD - Read)
        List<CollectionPoint> entities = repository.findAll(); // Buscar todas as entidades no banco de dados.
        return CollectionPointMapper.toResponseDto(entities); // Converter as entidades em DTOs de resposta.

    }

    @Override
    public CollectionPointResponseDto findById(Long id) { // EX02 - Criar método para buscar um lixo eletrônico por ID. (CRUD - Read)
        CollectionPoint entity = findEntityyById(id); // Buscar a entidade no banco de dados.
        return CollectionPointMapper.toResponseDto(entity); // Converter a entidade em DTO de resposta.
    }

    @Override
    public CollectionPointResponseDto update(CollectionPointRequestDto dto) { // EX02 - Criar método para atualizar um lixo eletrônico. (CRUD - Update)
        CollectionPoint cp = findEntityyById(id); // Buscar a entidade no banco de dados.
        CollectionPoint cp = CollectionPointMapper.toEntity(cp, dto); // Utilizar o mapper para converter o DTO em entidade.
        return CollectionPointMapper.toResponseDto(repository.save(cp)); // Salvar a entidade no banco de dados e converter em DTO de resposta.
    }   

    @Override
    public void delete(Long id) { // EX02 - Criar método para deletar um lixo eletrônico. (CRUD - Delete)
        CollectionPoint cp = findEntityyById(id); // Buscar a entidade no banco de dados.        
        repository.delete(cp); // Deletar a entidade no banco de dados.
    }


    private CollectionPoint findEntityyById(Long id){ // EX02 - Criar método para buscar uma entidade por ID. (CRUD - Read)
        return repository.findById(id).orElseThrow(() -> new CollectionPointNotFoundException(id)); // Buscar a entidade no banco de dados. Se não encontrar, lançar exceção.
    }

    private CollectionPoint create(CollectionPoint cp, CollectionPoint dto){ // EX02 - Criar método para salvar uma entidade. (CRUD - Create)
        CollectionPointMapper.toEntity(cp, dto); // Utilizar o mapper para converter o DTO em entidade.

        for(CollectionPointMaterialRequestDto materialDto :: dto.getMaterials()){ // criar método para salvar materiais de um lixo eletrônico. 
            CollectionPointMaterial material = new CollectionPointMaterial(); // Criar um novo material.
            material.setCollectionPoint(cp); // Associar o material ao lixo eletrônico.
            material.setMaxCapacity(materialDto.maxCapacity()); // Definir a capacidade máxima do material.

            ElectronicWaste ew = electronicWasteService.findEntityyById(materialDto.electronicWasteId()); // Buscar o lixo eletrônico no banco de dados.
            material.setCollectionPoint(ew); // Associar o material ao lixo eletrônico.

            cp.getMaterials().add(material); // Adicionar o material ao lixo eletrônico.
           } 
        return CollectionPointMapper.toResponseDto(repository.save(cp)); // Salvar a entidade no banco de dados e converter em DTO de resposta.
         }
}
