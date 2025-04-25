package freeland.ifc.app.domain;

import java.util.Date;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;

@Entity
public class Employe {

    @EmbeddedId
    private  EmployeId employeId;

    @Embedded
    @AttributeOverride(name = "id", column = @Column(name = "entreprise_id"))
    private  EntrepriseId entrepriseId;

    private  String Matricule;
    private  String NomComplet;
    private  Date DateEmbauche;
    private  Date DateNaissance;
}
