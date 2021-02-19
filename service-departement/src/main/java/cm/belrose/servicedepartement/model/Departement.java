package cm.belrose.servicedepartement.model;


import javax.persistence.*;

@Entity
public class Departement {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "departement_id")
    private Long id;
    @Column(name = "departement_code")
    private String code;
    @Column(name = "departement_nom")
    private String nom;
    @Column(name = "departement_adresse")
    private String adresse;

    public Departement() {
    }

    public Departement(String code, String nom, String adresse) {
        this.code = code;
        this.nom = nom;
        this.adresse = adresse;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
}
