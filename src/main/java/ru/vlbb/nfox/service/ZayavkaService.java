package ru.vlbb.nfox.service;

import lombok.extern.apachecommons.CommonsLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.vlbb.nfox.model.Zayavka;
import ru.vlbb.nfox.storage.ZayavkaStorage;

import java.util.List;

@Component
public class ZayavkaService {

    private final ZayavkaStorage storage;

    @Autowired
    public ZayavkaService(ZayavkaStorage storage) {
        this.storage = storage;
    }

    public Zayavka create(Zayavka zayavka) {
        return storage.save(zayavka);
    }

    public Zayavka update(Zayavka zayavka) {
        return ValidationUtil.checkNotFoundWithId(storage.save(zayavka), zayavka.getId());
    }

    public void delete(int id) {
        ValidationUtil.checkNotFoundWithId(storage.delete(id), id);
    }

    public Zayavka get(int id) {
        return ValidationUtil.checkNotFoundWithId(storage.get(id), id);
    }

    public List<Zayavka> getAll() {
        return storage.getAll();
    }

}
