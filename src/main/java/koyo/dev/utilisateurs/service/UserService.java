package koyo.dev.utilisateurs.service;

import jakarta.transaction.Transactional;
import koyo.dev.utilisateurs.entite.User;
import koyo.dev.utilisateurs.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class UserService {

    private static final Logger log = LoggerFactory.getLogger(UserService.class);
    public final UserRepository userRepository;

    private BCryptPasswordEncoder bCryptPasswordEncoder;
    public User create(User user){
       String mdpCrypte = this.bCryptPasswordEncoder.encode(user.getPassword());
       user.setPassword(mdpCrypte);
       if(!user.getEmail().contains("@")){
           throw new RuntimeException("Votre email est invalide");
       }

        this.userRepository.save(user);
        log.info("nouvelle utilisateur ajouté ");
        return user;
    }

    @Transactional
    public Iterable<User> getUser(){
        long data = this.userRepository.count();
        List<User> users = userRepository.findAll();
        System.out.println(users);
        if (users.size() <= 0) {
            System.out.println("Aucun utilisateur trouvé.");
        } else {
            System.out.println("Liste des utilisateurs récupérée :");
            for (User user : users) {
                System.out.println(user.toString());}
        }
        return  users;
    }




}
