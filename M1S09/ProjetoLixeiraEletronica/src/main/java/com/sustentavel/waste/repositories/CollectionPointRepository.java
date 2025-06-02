package com.sustentavel.waste.repositories;

import com.sustentavel.waste.entidades.CollectionPoint;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CollectionPointRepository extends JpaRepository<CollectionPoint, Long> {
    // EX2: Criar classes de repositório para as entidades

     // EX4: Criar método para buscar pontos de coleta de resíduos eletronicos 
    @Query("SELECT DISTINCT cp FROM CollectionPoint cp JOIN cp.materials m JOIN m.electronicWaste ew WHERE LOWER(ew.type) LIKE LOWER(CONCAT('%', :name, '%'))")
    List<CollectionPoint> findByElectronicWasteTypeContainingIgnoreCase(@Param("name") String name);

}