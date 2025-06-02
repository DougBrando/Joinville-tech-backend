package com.sustentavel.waste.controllers;

import com.sustentavel.waste.dtos.eSyndrome.waste.dtos.electronicwastes.ElectronicWasteRequestDto;
import com.sustentavel.waste.dtos.electronicwastes.ElectronicWasteResponseDto;
import com.sustentavel.waste.services.ElectronicWasteService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus; 
import org.springframework.web.bind.annotation.*;

import java.util.List;

// EX02 - Criar os Endpoints, métodos HTTP:
@RequiredArgsConstructor
@RestController
@RequestMapping("/electronic-wastes")
public class ElectronicWasteController {

    private final ElectronicWasteService service;


    @PostMapping // POST /electronic-wastes
    @ResponseStatus(HttpStatus.CREATED) // Metodo HTTP 
    public ElectronicWasteResponseDto save(@RequestBody ElectronicWasteRequestDto dto) { // Criação de um novo resíduo eletrônico (CRUD - CREATE)
        return service.create(dto);
    }

    @GetMapping // GET /electronic-wastes
    public List<ElectronicWasteResponseDto> findAll() { // Listagem de todos os resíduos eletrônicos (CRUD - READ)
        return service.findAll();
    }

    @GetMapping("/{id}") // GET /electronic-wastes/{id}
    public ElectronicWasteResponseDto findById(@PathVariable Long id) { // Busca de um resíduo eletrônico pelo ID (CRUD - READ)
        return service.findById(id);
    }

    @PutMapping("/{id}") // PUT /electronic-wastes/{id}
    public ElectronicWasteResponseDto update(@PathVariable Long id, @RequestBody ElectronicWasteRequestDto dto) { // Atualização de um resíduo eletrônico (CRUD - UPDATE)
        return service.update(id, dto);
    }

    @DeleteMapping("/{id}") // DELETE /electronic-wastes/{id}
    @ResponseStatus(HttpStatus.NO_CONTENT) // Metodo HTTP  
    public void delete(@PathVariable Long id) { // Exclusão de um resíduo eletrônico (CRUD - DELETE)
        service.delete(id);
    }
}