package freeland.ifc.app.domain;

import java.util.UUID;

import org.springframework.util.Assert;

public record EmployeId(UUID id)  {

    public EmployeId {
        Assert.notNull(id, "id must not be null");
    }

    public EmployeId() {
        this(UUID.randomUUID());
    }
}
