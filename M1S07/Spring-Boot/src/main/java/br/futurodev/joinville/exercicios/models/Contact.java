package br.futurodev.joinville.exercicios.models;

import java.util.ArrayList;
import java.util.List;
import lombok.AccessLevel;
import lombok.Getter; // Importa a anotação @Getter
import lombok.Setter; // Importa a anotação @Setter


import java.math.BigDecimal;

@Getter
@Setter
public class Contract{

  @Getter
  private static final List<Contract> contracts= new ArrayList<>();
  private static Long sequence = 1L;// Sequência para gerar IDs únicos

  @Setter(AccessLevel.NONE)// Define o setter como private
  private Long id;
  private Collector collector;
  private List<Route> routes = new ArrayList<>();


  public Contract(){
    this.id = sequence++;
  }

  public static Contract addContract(Contract contract){
    contracts.add(contract);
    return contract;
  }

 
}