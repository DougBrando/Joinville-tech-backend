package com.sustentavel.waste.services;

import com.sustentavel.waste.dtos.collectionpoints.CollectionPointRequestDto;
import com.sustentavel.waste.dtos.collectionpoints.CollectionPointResponseDto;

import java.util.List;


public interface CollectionPointService {

    // EX02 - Criar CRUD e classe de serviços.
    CollectionPointResponseDto create(CollectionPointRequestDto dto); // CRUD - Create
    List<CollectionPointResponseDto> findAll(); // CRUD - Read
    CollectionPointResponseDto findById(Long id); // CRUD - Read
    CollectionPointResponseDto update(Long id, CollectionPointRequestDto dto); // CRUD - Update
    void delete(Long id); // CRUD - Delete

    List<CollectionPointResponseDto> findByElectronicWasteName(String name);
}
