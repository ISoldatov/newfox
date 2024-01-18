package ru.vlbb.nfox.model;

import lombok.*;
import lombok.experimental.Accessors;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
//@Accessors(fluent = true, chain = true)
@AllArgsConstructor
public class Client extends AbstractBaseEntity {
    private String name;
    private String inn;
    private ClientType type;

}
