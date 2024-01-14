package ru.vlbb.nfox.model;

import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum CreditForm {
    NKL("НКЛ"),
    VKL("ВКЛ"),
    OVERDRAFT("Овердрафт"),
    OTIMC("Единовременное зачисление средств Заемщика");

    private final String tittle;

}
