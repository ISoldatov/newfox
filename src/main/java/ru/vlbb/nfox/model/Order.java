package ru.vlbb.nfox.model;

import lombok.Data;
import lombok.experimental.Accessors;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Accessors(chain = true)
public class Order extends AbstractBaseEntity {

    //id клиента
    private final int cusId;

    // дата создания заявки
    private final LocalDateTime createDate;

    //сумма заявки
    private final double amount;

    //кол-во месяцев
    private final int period;

    //целевое назначение ссуды
    private final CreditTarget target;

    //форма кредитования
    private final CreditForm form;

    //график погашения ссуды
//    private final AbstractCreditCalendar calendar;

    //Обеспечение ссуды
    private final Pledge pledge;

    //Поручительство
    private String guarantee;

    //Связанность с Банком
    private  boolean isBankAffiliation;

    //Орган принимающий решение о выдаче ссуды
    private int decideDepartment;

    //Дата осмотра бизнеса
    private LocalDate inspectionDate;

    //Связанные клиенты
    private List<Integer> relationships;

    //Статус заявки
    private OrderStatus status;

    //Пользователь, который завел заявку
    private final int userId;
}


