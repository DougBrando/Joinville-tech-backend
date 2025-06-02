package com.sustentavel.waste.services;

import com.sustentavel.waste.dtos.electronicwastes.ElectronicWasteRequestDto;
import com.sustentavel.waste.dtos.electronicwastes.ElectronicWasteResponseDto;
import com.sustentavel.waste.entidades.ElectronicWaste;

import java.util.List;

public interface ElectronicWasteService {

    // EX03 - Criar CRUD e classe de serviços.
    ElectronicWasteResponseDto create(ElectronicWasteRequestDto dto); // CRUD - Create
    List<ElectronicWasteResponseDto> findAll(); // CRUD - Read
    ElectronicWasteResponseDto findById(Long id); // CRUD - Read
    ElectronicWasteResponseDto update(Long id, ElectronicWasteRequestDto dto); // CRUD - Update
    void delete(Long id); // CRUD - Delete


    ElectronicWaste findEntityById(Long id);

}
