package cm.belrose.serviceemploye.dto;


public class Departement {
    private Long id;
    private String code;
    private String nom;
    private String adresse;

    public Departement() {
    }

    public Departement(Long id, String code, String nom, String adresse) {
        this.id = id;
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
