package com.sustentavel.waste.controllers;

import com.sustentavel.waste.dtos.collectionpoints.CollectionPointRequestDto;
import com.sustentavel.waste.dtos.collectionpoints.CollectionPointResponseDto;
import com.sustentavel.waste.services.CollectionPointService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/collection-points")
public class CollectionPointController {

private final CollectionPointService service;


    @PostMapping // POST /electronic-wastes
    @ResponseStatus(HttpStatus.CREATED) // Metodo HTTP 
    public CollectionPointResponseDto save(@RequestBody CollectionPointRequestDto dto) { // Criação de um novo ponto de coleta  (CRUD - CREATE)
        return service.create(dto);
    }

    @GetMapping // GET /collect-points
    @ResponseStatus(HttpStatus.OK) // Metodo HTTP
    public List<CollectionPointResponseDto> findAll() { // Listagem de todos os pontos de coleta (CRUD - READ)
        return service.findAll();
    }

    @GetMapping("/{id}") // GET /collect-points/{id}
    @ResponseStatus(HttpStatus.OK) // Metodo HTTP
    public CollectionPointResponseDto findById(@PathVariable Long id) { // Busca de um ponto de coleta por ID (CRUD - READ)
        return service.findById(id);
    }

    @PutMapping("/{id}") // PUT /collect-points/{id}
    @ResponseStatus(HttpStatus.OK) // Metodo HTTP
    public CollectionPointResponseDto update(@PathVariable Long id, @RequestBody CollectionPointRequestDto dto) { // Atualização de um ponto de coleta (CRUD - UPDATE)
        return service.update(id, dto);
    }

    @DeleteMapping("/{id}") // DELETE /collect-points/{id}
    @ResponseStatus(HttpStatus.NO_CONTENT) // Metodo HTTP  
    public void delete(@PathVariable Long id) { // Exclusão de um ponto de coleta (CRUD - DELETE)
        service.delete(id);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK) // Metodo HTTP
    public List<CollectionPointResponseDto> findByElectroinicWasteName(@PathVariable String name) { // Busca de pontos de coleta por nome de resíduo étrônico (CRUD - READ)
        return service.findByElectronicWasteName(name); // Chamada ao serviço para buscar pontos de coleta
    }

}
