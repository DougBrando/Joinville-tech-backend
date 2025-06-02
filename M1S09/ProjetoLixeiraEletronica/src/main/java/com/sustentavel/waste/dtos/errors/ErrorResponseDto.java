package com.sustentavel.waste.dtos.errors;

public record ErrorResponseDto(
    //// EX02 - Criar CRUD para a entidade Lixo eletrônico utilizando DTOs.
    String code,
    String message,
    String cause,
    String exceptionClassName
) {
}
