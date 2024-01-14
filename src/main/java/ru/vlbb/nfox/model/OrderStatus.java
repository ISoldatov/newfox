package ru.vlbb.nfox.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum OrderStatus {
    NEW("Новая"),
    IN_PROGRESS("В процессе"),
    ACCEPT("Одобрена"),
    DENIED("Отказана");

    private final String tittle;
}
