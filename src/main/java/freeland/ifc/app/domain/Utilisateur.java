package freeland.ifc.app.domain;

import jakarta.persistence.EmbeddedId;

public class Utilisateur {
    
    @EmbeddedId
    private  UtilisateurId id;
    private  String email;
    private  String password;
    private  String nomComplet;
}
