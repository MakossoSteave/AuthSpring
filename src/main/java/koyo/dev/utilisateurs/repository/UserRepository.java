package koyo.dev.utilisateurs.repository;

import koyo.dev.utilisateurs.entite.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository  extends CrudRepository <User , Integer> {
}
