package freeland.ifc.app.domain;

import java.util.UUID;

import org.springframework.util.Assert;

public record UtilisateurId(UUID id)  {


    public UtilisateurId {
        Assert.notNull(id, "id must not be null");
    }

    public UtilisateurId() {
        this(UUID.randomUUID());
    }
}
