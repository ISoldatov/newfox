package ru.vlbb.nfox.util;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class ErrorResponse {
    // название ошибки
    private final String error;
    // подробное описание
    private final String description;

//    public ErrorResponse(String error, String description) {
//        this.error = error;
//        this.description = description;
//    }
//
//    // геттеры необходимы, чтобы Spring Boot мог получить значения полей
//    public String getError() {
//        return error;
//    }
//
//    public String getDescription() {
//        return description;
//    }
}
