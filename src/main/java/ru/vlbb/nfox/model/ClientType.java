package ru.vlbb.nfox.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
public enum ClientType {
    FL(1, "ФЛ"),
    UL(2, "ЮЛ"),
    FUL(3, "Филиал ЮЛ"),
    IP(4, "ИП"),
    B(5, "Банк");

    private final int flag;
    private final String title;

    ClientType(int flag, String title) {
        this.flag = flag;
        this.title = title;
    }

}
