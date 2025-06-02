package com.sustentavel.waste.mappers;

import com.sustentavel.waste.dtos.collectionpoints.CollectionPointMaterialRequestDto;
import com.sustentavel.waste.dtos.collectionpoints.CollectionPointMaterialResponseDto;
import com.sustentavel.waste.entidades.CollectionPointMaterial;

import java.util.List;

public class CollectionPointMaterialMapper {

    private CollectionPointMaterialMapper() {}

    public static CollectionPointMaterialResponseDto toResponseDto(CollectionPointMaterial entity) {
        return new CollectionPointMaterialResponseDto(
            entity.getId(),
            ElectronicWasteMapper.toResponseDto(entity.getElectronicWaste()),
            entity.getMaxCapacity() 
        );
    }

    public static List<CollectionPointMaterialResponseDto> toResponseDto(List<CollectionPointMaterial> entities) {
        return entities.stream().map(CollectionPointMaterialMapper::toResponseDto).toList();
    }
}