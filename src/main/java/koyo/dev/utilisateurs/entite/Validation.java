package koyo.dev.utilisateurs.entite;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Cascade;

import java.time.Instant;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "validation")
public class Validation {

    private int id;
    private Instant creation;
    private Instant expire;
    private Instant activation;
    private String code;
    @OneToOne(cascade = CascadeType.ALL)
    private User user;

    public Validation() {
    }

    public Validation(Instant activation, String code, Instant creation, Instant expire, int id, User user) {
        this.activation = activation;
        this.code = code;
        this.creation = creation;
        this.expire = expire;
        this.id = id;
        this.user = user;
    }

    public Instant getActivation() {
        return activation;
    }

    public void setActivation(Instant activation) {
        this.activation = activation;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Instant getCreation() {
        return creation;
    }

    public void setCreation(Instant creation) {
        this.creation = creation;
    }

    public Instant getExpire() {
        return expire;
    }

    public void setExpire(Instant expire) {
        this.expire = expire;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
