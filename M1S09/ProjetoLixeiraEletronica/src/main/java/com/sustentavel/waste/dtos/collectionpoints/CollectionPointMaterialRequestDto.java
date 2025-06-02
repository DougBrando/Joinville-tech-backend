package com.sustentavel.waste.dtos.collectionpoints;

import java.math.BigDecimal;

public record CollectionPointMaterialRequestDto( 
    //// EX02 - Criar CRUD para a entidade Lixo eletrônico utilizando DTOs.
Long electronicWasteId,
    BigDecimal maxCapacity
) {}