package ru.vlbb.nfox.util;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import ru.vlbb.nfox.controller.ClientController;
import ru.vlbb.nfox.util.exception.NotFoundException;

@RestControllerAdvice(assignableTypes = ClientController.class)
public class ErrorHandler {

    @ExceptionHandler
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ErrorResponse handleNotFoundException(final NotFoundException e) {
        return new ErrorResponse("Ошибка поиска", e.getMessage());
    }

}
