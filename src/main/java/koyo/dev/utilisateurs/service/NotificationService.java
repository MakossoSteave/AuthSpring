package koyo.dev.utilisateurs.service;

import koyo.dev.utilisateurs.entite.Validation;
import lombok.AllArgsConstructor;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class NotificationService {

    JavaMailSender javaMailSender;
        public void envoyer(Validation validation){
        
        }
}
