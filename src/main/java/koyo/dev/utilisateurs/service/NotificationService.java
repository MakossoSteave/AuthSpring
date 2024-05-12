package koyo.dev.utilisateurs.service;

import koyo.dev.utilisateurs.entite.Validation;
import lombok.AllArgsConstructor;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class NotificationService {

    JavaMailSender javaMailSender;
        public void envoyer(Validation validation){
            SimpleMailMessage mailMessage= new SimpleMailMessage();
            mailMessage.setFrom("makossosteave27@gmail.com");
            mailMessage.setTo(validation.getUser().getEmail());
            mailMessage.setSubject("votre code d'activation");
            String text= String.format("Bonjour <br /> votre code d'activation est ",
                        validation.getCode()
                );
            mailMessage.setText(text);

            javaMailSender.send(mailMessage);
        }
}
