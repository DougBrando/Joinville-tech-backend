package br.futurodev.joinville.exercicios.serverces;
import java.util.List;
import org.springframework.stereotype.Service;
import br.futurodev.joinville.exercicios.models.Collector;

@Service
public class CollectorService{
  
  public Collector createCollector(Collector collector){
    return Collector.addCollector(collector);
  }

  public List<Collector> findAll(){
    return Collector.getCollectors();
  }

  public List<Collector> findById (Long id){
    for (Collector : colector){
      if (collector.getId().equals(id));
      return collector;
    }
    return null;
  }

  
}