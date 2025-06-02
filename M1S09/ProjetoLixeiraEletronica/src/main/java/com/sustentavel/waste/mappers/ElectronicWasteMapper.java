package com.sustentavel.waste.mappers;

import com.sustentavel.waste.dtos.electronicwastes.ElectronicWasteRequestDto;
import com.sustentavel.waste.dtos.electronicwastes.ElectronicWasteResponseDto;
import com.sustentavel.waste.entidades.ElectronicWaste;

import java.util.List;

public class ElectronicWasteMapper {

    private ElectronicWasteMapper() {}

    public static ElectronicWaste toEntity(ElectronicWaste entity, ElectronicWasteRequestDto dto) {
        entity.setType(dto.name());
        entity.setDescription(dto.description());
        return entity;
    }
    
    public static ElectronicWasteResponseDto toResponseDto(ElectronicWaste entity) {
        return new ElectronicWasteResponseDto(
            entity.getId(),
            entity.getType(),
            entity.getDescription()
        );
    }

    public static List<ElectronicWasteResponseDto> toResponseDto(List<ElectronicWaste> entities) {
        return entities.stream().map(ElectronicWasteMapper::toResponseDto).toList();
    }
}