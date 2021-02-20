package cm.belrose.servicedepartement.model;


import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Departement implements Serializable {
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
}
