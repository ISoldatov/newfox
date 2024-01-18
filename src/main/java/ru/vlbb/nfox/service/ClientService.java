package ru.vlbb.nfox.service;

import org.springframework.stereotype.Service;
import ru.vlbb.nfox.model.Client;
import ru.vlbb.nfox.storage.ClientStorage;

@Service
public class ClientService {

    private final ClientStorage clientStorage;

    public ClientService(ClientStorage clientStorage) {
        this.clientStorage = clientStorage;
    }

    public Client get(String inn) {
        return clientStorage.get(inn);
    }

}
