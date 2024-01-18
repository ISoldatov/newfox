package ru.vlbb.nfox.util;

import ru.vlbb.nfox.model.Client;
import ru.vlbb.nfox.to.ClientTo;

public class ClientUtil {
    public static ClientTo createTo(Client client) {
        return ClientTo.builder()
                .id(client.getId())
                .name(client.getName())
                .inn(client.getInn())
                .type(client.getType().getTitle())
                .build();
    }
}
