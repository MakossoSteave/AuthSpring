package koyo.dev.utilisateurs.controller;

import koyo.dev.utilisateurs.entite.Avis;
import koyo.dev.utilisateurs.service.AvisService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

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

    @RequestMapping("get")
    @GetMapping(produces = APPLICATION_JSON_VALUE)
    public  @ResponseBody List<Avis> getAvis(){
      return this.avisService.getAvis();
    }

    @RequestMapping("get/{id}")
    public Avis Read(@PathVariable int id){
        return this.avisService.findOne(id);
    }


}
