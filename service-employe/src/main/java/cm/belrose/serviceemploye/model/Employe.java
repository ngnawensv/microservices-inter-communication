package cm.belrose.serviceemploye.model;


import javax.persistence.*;

@Entity
public class Employe {
    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    @Column(name = "employe_id")
    private Long id;
    @Column(name = "employe_nom")
    private String nom;
    @Column(name = "employe_prenom")
    private String prenom;
    @Column(name = "employe_email")
    private String email;
    @Column(name = "deprtement_id")
    private Long departementId;

    public Employe() {
    }

    public Employe(String nom, String prenom, String email, Long departementId) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.departementId = departementId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getDepartementId() {
        return departementId;
    }

    public void setDepartementId(Long departementId) {
        this.departementId = departementId;
    }
}
