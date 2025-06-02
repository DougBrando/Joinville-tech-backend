package com.sustentavel.waste.dtos.collectionpoints;

import java.util.List;

public record CollectionPointRequestDto(
    //// EX02 - Criar CRUD para a entidade Lixo eletrônico utilizando DTOs.
    String name,
    String address,
    String collectionPeriod,
    List<CollectionPointMaterialRequestDto> materials
) {}
