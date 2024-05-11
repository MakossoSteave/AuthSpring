package koyo.dev.utilisateurs.repository;

import koyo.dev.utilisateurs.entite.Validation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ValidationRepository extends JpaRepository<Validation ,Integer> {
}
