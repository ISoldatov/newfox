package ru.vlbb.nfox.util;

import lombok.experimental.UtilityClass;
import ru.vlbb.nfox.model.AbstractBaseEntity;
import ru.vlbb.nfox.model.Order;
import ru.vlbb.nfox.util.exception.NotFoundException;

import java.time.LocalDate;

@UtilityClass
public class ValidationUtil {
//
//    public static final int MAX_DESCRIPTION_LENGTH = 200;
//    public static final LocalDate EARLY_RELEASE_DATE = LocalDate.of(1895, 12, 28);
//    public static final int MIN_DURATION = 1;
//
//    public void checkFilm(Order order) {
//        if (order.getName().isBlank()) {
//            throw new FilmValidationException("Название не может быть пустым.");
//        }
//        if (order.getDuration() < MIN_DURATION) {
//            throw new FilmValidationException("Продолжительность фильма должна быть положительной.");
//        }
//        if (order.getDescription().length() > MAX_DESCRIPTION_LENGTH) {
//            throw new FilmValidationException("Максимальная длина описания — 200 символов.");
//        }
//        if (order.getReleaseDate().isBefore(EARLY_RELEASE_DATE)) {
//            throw new FilmValidationException("дата релиза — не раньше 28 декабря 1895 года");
//        }
//    }
//
//    public void checkUser(User user) {
//        if (user.getEmail().isBlank() || !user.getEmail().contains("@")) {
//            throw new UserValidationException("Электронная почта не может быть пустой и должна содержать символ @.");
//        }
//        if (user.getLogin().isBlank()) {
//            throw new UserValidationException("Логин не может быть пустым и содержать пробелы.");
//        }
//        if (user.getBirthday().isAfter(LocalDate.now())) {
//            throw new UserValidationException("Дата рождения не может быть в будущем.");
//        }
//    }

    public static void checkNew(AbstractBaseEntity entity) {
        if (!entity.isNew()) {
            throw new IllegalArgumentException(entity + " должно быть новое (id=null)");
        }
    }

    public static void checkNotNew(AbstractBaseEntity entity) {
        if (!entity.isNew()) {
            throw new IllegalArgumentException(entity + " должно быть не новое (id=not null)");
        }
    }

    public static <T> T checkNotFoundWithId(T object, int id) {
        checkNotFoundWithId(object != null, id);
        return object;
    }

    public static void checkNotFoundWithId(boolean found, int id) {
        checkNotFound(found, "id=" + id);
    }

    public static <T> T checkNotFound(T object, String msg) {
        checkNotFound(object != null, msg);
        return object;
    }

    public static void checkNotFound(boolean found, String msg) {
        if (!found) {
            throw new NotFoundException(String.format(msg));
        }
    }
}
