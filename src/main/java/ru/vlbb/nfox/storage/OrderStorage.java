package ru.vlbb.nfox.storage;

import ru.vlbb.nfox.model.Order;

import java.util.List;

public interface OrderStorage {
    Order save(Order order);

    boolean delete(int id);

    Order get(int id);

    List<Order> getAll();
}
