package br.futurodev.joinville.exercicios.serverces;
import java.util.List;
import org.springframework.stereotype.Service;
import br.futurodev.joinville.exercicios.models.Route;

@Service
public class RouteService{
  public Route createRoute(Route route){
    return Route.addRoute(route);
  }

  public List<Route> findAll(){
    return Route.getRoutes();
  }

  public List<Route> findById (Long id){
    for (Route : route){
      if (Route.getId().equals(id));
      return route;
    }
    return null;
  }

}