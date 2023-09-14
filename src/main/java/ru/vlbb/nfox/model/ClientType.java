package ru.vlbb.nfox.model;

public enum ClientType {
    PP("Physical Person"),
    PE("Private Entrepreneur"),
    LP("Legal Person");

    private String title;

    ClientType(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
