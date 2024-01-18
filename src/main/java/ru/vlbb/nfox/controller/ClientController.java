package ru.vlbb.nfox.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import ru.vlbb.nfox.model.Client;
import ru.vlbb.nfox.service.ClientService;
import ru.vlbb.nfox.to.ClientTo;
import ru.vlbb.nfox.util.ClientUtil;

@RestController
public class ClientController {

    public static final Logger log = LoggerFactory.getLogger(ClientController.class);

    private final ClientService clientService;

    @Autowired
    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping(value = "/client/{inn}")
    public ClientTo get(@PathVariable String inn) {
        return ClientUtil.createTo(clientService.get(inn));
    }

}
