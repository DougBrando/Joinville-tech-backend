package com.sustentavel.waste.mappers;

import com.sustentavel.waste.dtos.electronicwastes.CollectionPointRequestDto;
import com.sustentavel.waste.dtos.electronicwastes.CollectionPointResponseDto;
import com.sustentavel.waste.entidades.CollectionPoint;

import java.util.List;

public class CollectionPointMapper {

    private CollectionPointMapper() {}

    public static CollectionPoint toEntity(CollectionPoint entity, CollectionPointRequestDto dto) {
        entity.setName(dto.name());
        entity.setAddress(dto.address());
        entity.setCollectionPeriod(dto.collectionPeriod());
        return entity;
    }
    
    public static CollectionPointResponseDto toResponseDto(CollectionPoint entity) {
        return new CollectionPointResponseDto(
            entity.getId(),
            entity.getName(),
            entity.getAddress(),
            entity.getCollectionPeriod(),
            CollectionPointMaterialMapper.toResponseDto(entity.getMaterials())
        );
    }

    public static List<CollectionPointResponseDto> toResponseDto(List<CollectionPoint> entities) {
        return entities.stream().map(CollectionPointMapper::toResponseDto).toList();
    }
}