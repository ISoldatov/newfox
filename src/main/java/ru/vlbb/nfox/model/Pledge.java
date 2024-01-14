package ru.vlbb.nfox.model;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Pledge extends AbstractBaseEntity {
    //Тип залога
    private final PledgeType pledge;

    //Наличие обременения
    private final boolean isBurden;

    //Залогодатель
    private final String pledgeName;

    //Залоговая сумма
    private final double amount;

    //Отсрочка в оформлении - указание даты принятия в залог
    private LocalDate dateDelay;

}
