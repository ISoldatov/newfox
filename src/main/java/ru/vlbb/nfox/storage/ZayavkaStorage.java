package ru.vlbb.nfox.storage;

import ru.vlbb.nfox.model.Zayavka;

import java.util.List;

public interface ZayavkaStorage {
    Zayavka save(Zayavka zayavka);

    boolean delete(int id);

    Zayavka get(int id);

    List<Zayavka> getAll();
}
