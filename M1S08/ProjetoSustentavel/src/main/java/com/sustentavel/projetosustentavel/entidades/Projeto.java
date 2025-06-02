package com.sustentavel.projetosustentavel.entidades;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "projeto")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Projeto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, name = "nome_projeto")
    private String nome;

    private String descricao;

    private String regiao;

    @Column(name = "estimativa_reducao_co2")
    private Double estimativaReducaoCo2;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "organizacao_id", nullable = false)
    @JsonManagedReference
    private Organizacao organizacao;
}