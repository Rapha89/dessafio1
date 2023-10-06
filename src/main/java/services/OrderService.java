package services;

import entities.Order;
import org.springframework.beans.factory.annotation.Autowired;

public class OrderService {
    @Autowired
    private ShippingService shippingService;

    public double total(Order order){
        return order.getBasic()
                *(1 - order.getDiscount())
                + shippingService.shipment(order);
    }
}
