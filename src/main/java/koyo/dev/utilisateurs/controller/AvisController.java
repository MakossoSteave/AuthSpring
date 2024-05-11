package koyo.dev.utilisateurs.controller;

import koyo.dev.utilisateurs.entite.Avis;
import koyo.dev.utilisateurs.service.AvisService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("avis")
public class AvisController {

    private final AvisService avisService;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("add")
    public void Creer(@RequestBody Avis avis){
        this.avisService.Creer(avis);
    }

    @ResponseStatus(HttpStatus.OK)
    @RequestMapping("get")
    public List<Avis> getAvis(){
      return this.avisService.getAvis();
    }


}
