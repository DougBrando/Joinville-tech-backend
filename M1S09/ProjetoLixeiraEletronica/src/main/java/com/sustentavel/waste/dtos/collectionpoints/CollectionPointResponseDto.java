package com.sustentavel.waste.dtos.collectionpoints;

import java.util.List;

public record CollectionPointResponseDto(
    //// EX02 - Criar CRUD para a entidade Lixo eletrônico utilizando DTOs.
    Long id,
    String name,
    String address,
    String collectionPeriod,
    List<CollectionPointMaterialResponseDto> materials

) {}
