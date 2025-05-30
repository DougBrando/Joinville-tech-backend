package br.futurodev.joinville.exercicios.serverces;

import java.util.List;
import org.springframework.stereotype.Service;
import br.futurodev.joinville.exercicios.models.Contract;
import br.futurodev.joinville.exercicios.models.Collector;


@Service
public class ContractService {

  @Autowired
  private CollectorService collectorService;

  @Autowired
  private RouteService routeService;
  
  
  public Contract createContract(Contract contract) {
    Collector collection = collectorService.findById(contract.getCollector().getId());
    if (collection == null) {
      return null;
    } else {
      contract.setCollector(collection);
    }
    
    List<Route> routes = new ArrayList<>();
    for (Route route : contract.getRoutes()){
      Route foundRoute = routeService.findById(route.getId());
      if (foundRoute == null){
        return null;
      } else{
        routes.add(foundRoute);
      }
      
    }
    
    contract.setRoutes(routes);
    
    return Contract.addContract(contract);
  }
 
  public List<Contract> findAll(){
    return Contract.getContracts();
  }

  
  return null;
}

}