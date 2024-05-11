package koyo.dev.utilisateurs.service;

import koyo.dev.utilisateurs.entite.Avis;
import koyo.dev.utilisateurs.repository.AvisRepository;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class AvisService {

    private static final Logger log = LoggerFactory.getLogger(AvisService.class);
    private final AvisRepository avisRepository ;

    public  void Creer(Avis avis){
        this.avisRepository.save(avis);
        log.info("Nouvelle avis créer");
    }

    public List<Avis> getAvis(){
        log.info("List d'avis recuperé");
        return this.avisRepository.findAll();
    }

}
