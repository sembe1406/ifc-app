package freeland.ifc.app.domain;

import java.util.Date;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;

@Entity
public class Dossier {

    @EmbeddedId
    private DossierId id;

    private float salaireMensuelMoyen;
    private float montantIdemnite;
    private String ReferenceSimulateur;
    private SourceSim source ;
    private Norme norme;
    private long anciennete;
    private Date dateSimulation;
    private ContractType typeContrat;
    private StatutDossier statut;
    


}
