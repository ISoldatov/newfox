package ru.vlbb.nfox.model;

public class Client {
    private final String name;
    private final String inn;
    private final ClientType type;

    public Client(String name, String inn, ClientType type) {
        this.name = name;
        this.inn = inn;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getInn() {
        return inn;
    }

    public ClientType getType() {
        return type;
    }
}
