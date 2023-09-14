package ru.vlbb.nfox.model;

public abstract class AbstractNamedEntity extends ru.vlbb.nfox.model.AbstractBaseEntity {

    protected String name;

    protected AbstractNamedEntity(Integer id, String name) {
        super(id);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
