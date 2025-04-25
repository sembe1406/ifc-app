package freeland.ifc.app.domain;

import java.util.UUID;

import org.springframework.util.Assert;

public record EntrepriseId(UUID id)  {

    public EntrepriseId {
        Assert.notNull(id, "id must not be null");
    }

    public EntrepriseId() {
        this(UUID.randomUUID());
    }
}
