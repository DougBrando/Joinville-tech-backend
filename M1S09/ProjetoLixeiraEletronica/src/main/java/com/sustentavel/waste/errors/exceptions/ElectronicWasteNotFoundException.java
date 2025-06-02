package com.sustentavel.waste.errors.exceptions;

public class ElectronicWasteNotFoundException extends NotFoundException{// EX2: Criar tratamento de exceções 
    public ElectronicWasteNotFoundException(Long id){
        super("Eletronic waste", id);
    }

}
