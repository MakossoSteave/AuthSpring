package koyo.dev.utilisateurs.service;

import koyo.dev.utilisateurs.entite.User;
import koyo.dev.utilisateurs.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class UserService {

    public final UserRepository userRepository;

    public void create(User user){
        this.userRepository.save(user);
        System.out.println("nouvelle utilisateur ajouté ");
    }
}
