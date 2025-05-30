package br.futurodev.joinville.exercicios.models;

import java.util.ArrayList;
import java.util.List;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;


import lombok.Getter; // Importação do Lombok para gerar getters
import lombok.Setter; // Importação do Lombok para gerar setters

import java.math.BigDecimal;

@Getter
@Setter
public class Collector{

  @Getter
  private static final List<Collector> collectors= new ArrayList<>();
  private static Long sequence = 1L;// Sequência para gerar IDs únicos

  @Setter(AccessLevel.NONE)// Define o setter como private
  private Long id;
  private String name;
  private String description;


  public Collector(){
    this.id = sequence++;
  }

  public static Collector addCollector(Collector collector){
    collectors.add(collector);
    return collector;
  }

 
}