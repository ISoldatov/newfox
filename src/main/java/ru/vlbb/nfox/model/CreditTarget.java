package ru.vlbb.nfox.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum CreditTarget {
    TARGET_1("Цель №1"),
    TARGET_2("Цель №2"),
    TARGET_3("Цель №3");

    private final String target;
}
