package com.jonathan.aula.services;

import com.jonathan.aula.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    ShippingService shippingService;

    public double total(Order order) {
        return order.getBasic() - (order.getDiscount()/100 * order.getBasic()) + shippingService.shipment(order);
    }

}
