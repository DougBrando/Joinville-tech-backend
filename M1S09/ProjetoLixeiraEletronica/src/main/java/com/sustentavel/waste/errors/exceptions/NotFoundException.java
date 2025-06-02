package com.sustentavel.waste.errors.exceptions;

public abstract class NotFoundException extends RuntimeException { // EX2: Criar tratamento de exceções 
    NotFoundException(String objectName, Long id) {
        super(String.format("Object %s with id %d not found", objectName, id) );
    }

}
