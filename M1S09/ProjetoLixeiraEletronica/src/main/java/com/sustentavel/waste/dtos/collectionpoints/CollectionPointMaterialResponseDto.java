package com.sustentavel.waste.dtos.collectionpoints;

import java.math.BigDecimal;

import com.sustentavel.waste.dtos.electronicwastes.ElectronicWasteResponseDto;

public record CollectionPointMaterialResponseDto(
    //// EX02 - Criar CRUD para a entidade Lixo eletrônico utilizando DTOs.
    Long id,
    ElectronicWasteResponseDto electronicWaste,
    BigDecimal maxCapacity
) {}
