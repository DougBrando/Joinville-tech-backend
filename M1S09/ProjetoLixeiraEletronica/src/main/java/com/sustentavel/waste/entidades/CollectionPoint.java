package com.sustentavel.waste.entidades;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "collection_point")
public class CollectionPoint {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name; // Nome do ponto de coleta

    @Column(nullable = false)
    private String address; // Endereço do ponto de coleta


    private String collectionPeriod; // Período de coleta

    @OneToMany(mappedBy = "collectionPoint", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<CollectionPointMaterial> materials = new ArrayList<>();
        
}