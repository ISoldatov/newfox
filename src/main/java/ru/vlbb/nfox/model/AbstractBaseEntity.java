package ru.vlbb.nfox.model;


import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public abstract class AbstractBaseEntity {
    protected Integer id;

    protected AbstractBaseEntity(Integer id) {
        this.id = id;
    }

    public boolean isNew() {
        return this.id == null;
    }

}
