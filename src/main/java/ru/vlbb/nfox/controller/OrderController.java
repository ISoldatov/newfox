package ru.vlbb.nfox.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.vlbb.nfox.model.Order;
import ru.vlbb.nfox.service.OrderService;

@RestController
public class OrderController {

//    private final OrderService service;
//
//    @Autowired
//    public OrderController(OrderService service) {
//        this.service = service;
//    }
//
//    @PostMapping(value = "/order")
//    public Order create(@RequestBody Order order) {
//        return service.create(order);
//    }
//

}
