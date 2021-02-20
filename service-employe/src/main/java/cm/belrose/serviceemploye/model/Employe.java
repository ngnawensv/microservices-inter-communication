package cm.belrose.serviceemploye.model;




import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
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
}
