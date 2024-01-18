package ru.vlbb.nfox.to;

import lombok.Builder;
import lombok.Data;


@Data
@Builder
public class ClientTo {
    private final int id;

    private final String name;

    private final String inn;

    private final String type;
}
