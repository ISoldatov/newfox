package ru.vlbb.nfox.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.vlbb.nfox.model.Zayavka;
import ru.vlbb.nfox.service.ZayavkaService;

@RestController
public class ZayavkaController {

    private final ZayavkaService service;

    @Autowired
    public ZayavkaController(ZayavkaService service) {
        this.service = service;
    }

    @PostMapping(value = "/zayavka")
    public Zayavka create(@RequestBody Zayavka zayavka) {
        return service.create(zayavka);
    }


}
