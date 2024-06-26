package koyo.dev.utilisateurs.entite;

import jakarta.persistence.*;


@Entity
@Table(name = "user")
public class User  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id ;
    @Column(name = "email")
    private String email;
    @Column(name = "password")
    private String password ;
    @Column(name = "name")
    private String name ;
    @Column(name = "isEnabled")
    private Boolean actif = false ;
    @OneToOne(cascade = CascadeType.ALL)
    @Enumerated(EnumType.STRING)
    private Role role ;

    public User() {
    }

    public User(Boolean actif, String email, int id, String name, String password, Role role) {
        this.actif = actif;
        this.email = email;
        this.id = id;
        this.name = name;
        this.password = password;
        this.role = role;
    }

    public Boolean getActif() {
        return actif;
    }

    public void setActif(Boolean actif) {
        this.actif = actif;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }


}
