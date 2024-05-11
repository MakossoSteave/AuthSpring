package koyo.dev.utilisateurs.repository;

import koyo.dev.utilisateurs.entite.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository  extends JpaRepository<User , Integer> {

    User findByEmail(String email);
}
