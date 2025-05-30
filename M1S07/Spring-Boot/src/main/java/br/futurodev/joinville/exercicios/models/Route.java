package br.futurodev.joinville.exercicios.models;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;
import lombok.AccessLevel;

import java.util.ArrayList;
import java.util.List;


@Getter
@Setter
public class Route{

  @Getter
  private static final List<Route> routes = new ArrayList<>();
  private static Long sequence = 1L;

  
  
  @Setter(AccessLevel.NONE)
  private Long id;
  private String description;
  private String coverageArea; // Área de cobertura
  private BigDecimal efficencePercentage; // Porcentagem de eficiência

  
  public Route(){
    this.id = sequence++;
  }

  public static Route addRoute(Route route){
    routes.add(route);
    return route;
  }

  
}