package ru.vlbb.nfox.model;

import java.time.LocalDate;

public class Zayavka extends ru.vlbb.nfox.model.AbstractBaseEntity {
    private final int clientId;
    private final LocalDate creatDate;
    private final double amount;
    private final int userId;

    public Zayavka(int clientId, LocalDate creatDate, double amount, int userId) {
        this(null, clientId, creatDate, amount, userId);
    }

    public Zayavka(Integer id, int clientId, LocalDate creatDate, double amount, int userId) {
        super(id);
        this.id = id;
        this.clientId = clientId;
        this.creatDate = creatDate;
        this.amount = amount;
        this.userId = userId;
    }

    public int getClientId() {
        return clientId;
    }

    public double getAmount() {
        return amount;
    }

    public int getUserId() {
        return userId;
    }

    public LocalDate getCreatDate() {
        return creatDate;
    }
}


