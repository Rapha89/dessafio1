package com.example.services;

import com.example.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    @Autowired
    private ShippingService shippingService;

    public double total(Order order){
        return order.getBasic()
                *(1 - order.getDiscount()*0.01)
                + shippingService.shipment(order);
    }
}
