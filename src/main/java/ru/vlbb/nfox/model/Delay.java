package ru.vlbb.nfox.model;

import lombok.Data;

@Data
public class Delay extends AbstractCreditCalendar {
    //Наличие отсрочки
    private final Boolean isDelay;

    //сколько месяцев отсрочки
    private int periodDelay;
}
