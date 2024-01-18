package ru.vlbb.nfox.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.vlbb.nfox.exceptions.ValidationUtil;
import ru.vlbb.nfox.model.Order;
import ru.vlbb.nfox.storage.OrderStorage;

import java.util.List;

@Component
public class OrderService {

//    private final OrderStorage storage;
//
//    @Autowired
//    public OrderService(OrderStorage storage) {
//        this.storage = storage;
//    }
//
//    public Order create(Order order) {
//        return storage.save(order);
//    }
//
//    public Order update(Order order) {
//        return ValidationUtil.checkNotFoundWithId(storage.save(order), order.getId());
//    }
//
//    public void delete(int id) {
//        ValidationUtil.checkNotFoundWithId(storage.delete(id), id);
//    }
//
//    public Order get(int id) {
//        return ValidationUtil.checkNotFoundWithId(storage.get(id), id);
//    }
//
//    public List<Order> getAll() {
//        return storage.getAll();
//    }

}
