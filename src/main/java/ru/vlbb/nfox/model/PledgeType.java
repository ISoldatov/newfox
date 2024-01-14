package ru.vlbb.nfox.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum PledgeType {
    BUSINESS_REALTY("Коммерческая недвижимость"),
    RESIDENT_REALTY("Жилая недвижимость"),
    TRANSPORT("Транспорт"),
    EQUIPMENT("Оборудование"),
    TMC("ТМЦ");

    private final String tittle;
}
