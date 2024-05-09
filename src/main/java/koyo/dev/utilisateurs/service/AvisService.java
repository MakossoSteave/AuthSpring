package koyo.dev.utilisateurs.service;

import koyo.dev.utilisateurs.entite.Avis;
import koyo.dev.utilisateurs.repository.AvisRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class AvisService {

    private final AvisRepository avisRepository ;

public  void Creer(Avis avis){
    this.avisRepository.save(avis);
    System.out.println("un nouvelle avis à été créer");
}

}
