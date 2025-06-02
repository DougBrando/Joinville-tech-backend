package com.sustentavel.waste.errors.exceptions;

public class CollectionPointNotFoundException extends NotFoundException{ // EX2: Criar tratamento de exceções 
    public CollectionPointNotFoundException(Long id) {
        super("Collection point", id);
    }
}
