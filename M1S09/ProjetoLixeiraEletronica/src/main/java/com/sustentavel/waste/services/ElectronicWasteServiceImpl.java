package com.sustentavel.waste.services;

import com.sustentavel.waste.dtos.electronicwastes.ElectronicWasteRequestDto;
import com.sustentavel.waste.dtos.electronicwastes.ElectronicWasteResponseDto;
import com.sustentavel.waste.entidades.ElectronicWaste;
import com.sustentavel.waste.errors.exceptions.ElectronicWasteNotFoundException;
import com.sustentavel.waste.mappers.ElectronicWasteMapper;
import com.sustentavel.waste.repositories.ElectronicWasteRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ElectronicWasteServiceImpl implements ElectronicWasteService {   // EX02 - Criar CRUD para a entidade Lixo eletrônico utilizando DTOs.
    // EX03 - Criar CRUD e classe de serviços.
    private final ElectronicWasteRepository repository;

    @Override 
    public ElectronicWasteResponseDto create(ElectronicWasteRequestDto dto) { // EX02 - Criar método para criar um lixo eletrônico. (CRUD - Create)
        ElectronicWaste ew = ElectronicWasteMapper.toEntity(new ElectronicWaste, dto); // Utilizar o mapper para converter o DTO em entidade.
        return ElectronicWasteMapper.toResponseDto(repository.save(ew)); // Salvar a entidade no banco de dados e converter em DTO de resposta.
    }

    @Override
    public List<ElectronicWasteResponseDto> findAll(){ // EX02 - Criar método para buscar todos os lixos eletrônicos. (CRUD - Read)
        List<ElectronicWaste> entities = repository.findAll(); // Buscar todas as entidades no banco de dados.
        return ElectronicWasteMapper.toResponseDto(entities); // Converter as entidades em DTOs de resposta.

    }

    @Override
    public ElectronicWasteResponseDto findById(Long id) { // EX02 - Criar método para buscar um lixo eletrônico por ID. (CRUD - Read)
       return findEntityById(id); //  Chamada ao método que busca a entidade no banco de dados.
    }

    @Override
    public ElectronicWasteResponseDto update(ElectronicWasteRequestDto dto) { // EX02 - Criar método para atualizar um lixo eletrônico. (CRUD - Update)
        ElectronicWaste ew = findEntityyById(id); // Buscar a entidade no banco de dados.
        ElectronicWaste ew = ElectronicWasteMapper.toEntity(ew, dto); // Utilizar o mapper para converter o DTO em entidade.
        return ElectronicWasteMapper.toResponseDto(repository.save(ew)); // Salvar a entidade no banco de dados e converter em DTO de resposta.
    }   

    @Override
    public void delete(Long id) { // EX02 - Criar método para deletar um lixo eletrônico. (CRUD - Delete)
        ElectronicWaste ew = findEntityyById(id); // Buscar a entidade no banco de dados.        
        repository.delete(ew); // Deletar a entidade no banco de dados.
    }

    @Override
    public ElectronicWaste findEntityyById(Long id){ // EX02 - Criar método para buscar uma entidade no banco de dados.
        return repository.findById(id).orElseThrow(() -> new ElectronicWasteNotFoundException(id)); // Buscar a entidade no banco de dados. Se não encontrar, lançar exceção.
    }

}
