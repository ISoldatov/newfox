package ru.vlbb.nfox.storage;

import ru.vlbb.nfox.model.Client;

public interface ClientStorage {

    Client get(String inn);
}
