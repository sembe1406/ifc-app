package freeland.ifc.app.domain;

import org.springframework.boot.autoconfigure.amqp.RabbitConnectionDetails.Address;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;

@Entity
public class Entreprise {

    @EmbeddedId
    private EntrepriseId id;
    private String NomEntreprise ;
    private Secteur secteurActivite;
    private Norme norme;
    private String ville;
    
}
