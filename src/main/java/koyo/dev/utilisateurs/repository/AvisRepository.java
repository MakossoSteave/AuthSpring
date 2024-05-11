package koyo.dev.utilisateurs.repository;

import koyo.dev.utilisateurs.entite.Avis;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface AvisRepository extends JpaRepository<Avis , Integer> {
}
