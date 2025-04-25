package freeland.ifc.app.domain;

import java.util.UUID;

import org.springframework.util.Assert;

public record DossierId(UUID id) {

    public DossierId {
        Assert.notNull(id, "id must not be null");
    }

    public DossierId() {
        this(UUID.randomUUID());
    }
}
