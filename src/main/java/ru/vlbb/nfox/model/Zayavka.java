package ru.vlbb.nfox.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Zayavka extends ru.vlbb.nfox.model.AbstractBaseEntity {
    private final int clientId;
    private final LocalDateTime createDate;
    private final double amount;
    private final int userId;

    public Zayavka(int clientId, double amount, int userId) {
        this(null, clientId, amount, userId);
    }

    public Zayavka(Integer id, int clientId, double amount, int userId) {
        super(id);
        this.id = id;
        this.clientId = clientId;
        this.createDate = LocalDateTime.now();
        this.amount = amount;
        this.userId = userId;
    }

    public int getClientId() {
        return clientId;
    }

    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public double getAmount() {
        return amount;
    }

    public int getUserId() {
        return userId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Zayavka zayavka = (Zayavka) o;

        if (clientId != zayavka.clientId) return false;
        if (Double.compare(zayavka.amount, amount) != 0) return false;
        return createDate.equals(zayavka.createDate);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        result = 31 * result + clientId;
        result = 31 * result + createDate.hashCode();
        temp = Double.doubleToLongBits(amount);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}


