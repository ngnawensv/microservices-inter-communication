package cm.belrose.serviceemploye.dto;

import cm.belrose.serviceemploye.model.Employe;

public class ResponseTemplate {
    private Employe employe;
    private Departement departement;

    public ResponseTemplate() {
    }

    public ResponseTemplate(Employe employe, Departement departement) {
        this.employe = employe;
        this.departement = departement;
    }

    public Employe getEmploye() {
        return employe;
    }

    public void setEmploye(Employe employe) {
        this.employe = employe;
    }

    public Departement getDepartement() {
        return departement;
    }

    public void setDepartement(Departement departement) {
        this.departement = departement;
    }
}
