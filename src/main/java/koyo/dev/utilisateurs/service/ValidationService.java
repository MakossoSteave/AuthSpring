package koyo.dev.utilisateurs.service;

import koyo.dev.utilisateurs.entite.User;
import koyo.dev.utilisateurs.entite.Validation;
import koyo.dev.utilisateurs.repository.ValidationRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;
import java.util.Random;

@AllArgsConstructor
@NoArgsConstructor
@Service
public class ValidationService {

    @Autowired
   private ValidationRepository validationRepository ;
    @Autowired
   private NotificationService notificationService ;

   public void validation (User user){
       Validation validation = new Validation();
       validation.setUser(user);
       Instant creation = Instant.now();
       Instant expiration = creation.plus(10, ChronoUnit.MINUTES);

       Random random = new Random();
       int randomInteger =random.nextInt(999999);
       String code = String.format("%06d",randomInteger);

     validation.setCreation(creation);
     validation.setExpiration(expiration);
     validation.setCode(code);

       System.out.println(validation);
     this.validationRepository.save(validation);
    // this.notificationService.envoyer(validation);
       /**
        **
        * je mettrai en place l'envoi de mail quand j'aurai reflé mon authentification
        * avec gmail 
        * */
   }
}
