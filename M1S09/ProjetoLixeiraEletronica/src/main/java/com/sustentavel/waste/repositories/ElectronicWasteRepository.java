package com.sustentavel.waste.repositories;

import com.sustentavel.waste.entidades.ElectronicWaste;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ElectronicWasteRepository extends JpaRepository<ElectronicWaste, Long> {
        // EX2: Criar classes de repositório para as entidades
}