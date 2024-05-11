package koyo.dev.utilisateurs.entite;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import jakarta.persistence.*;
import koyo.dev.utilisateurs.entite.TypeRole;


@Entity
@Table(name = "role")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private TypeRole libelle;

    public Role() {}

    // Constructeur avec les champs
    public Role(int id, TypeRole libelle) {
        this.id = id;
        this.libelle = libelle;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public TypeRole getLibelle() {
        return libelle;
    }

    // Méthode pour définir le libelle à partir d'une chaîne
    @JsonCreator
    public static Role fromString(String value) {
        return new Role(0, TypeRole.fromString(value)); // Id mis à 0 ou à une valeur par défaut
    }

    // Méthode pour obtenir la représentation en chaîne du libelle
    @JsonValue
    public String getLibelleAsString() {
        return libelle.toString();
    }

    public void setLibelle(TypeRole libelle) {
        this.libelle = libelle;
    }
}
