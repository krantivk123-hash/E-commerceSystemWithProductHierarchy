
package com.ecommerce.orders;

import java.util.Date;
import com.ecommerce.cart.ShoppingCart;

public class Order {

    private static int counter=1000;

    private String orderId;
    private Date orderDate;
    private double finalAmount;

    public Order(ShoppingCart cart){
        this.orderId="ORD"+counter++;
        this.orderDate=new Date();
        this.finalAmount=cart.getTotalAmount()*1.18;
    }

    public void displayOrder(){
        System.out.println("===== ORDER CONFIRMED =====");
        System.out.println("Order ID: "+orderId);
        System.out.println("Order Date: "+orderDate);
        System.out.println("Final Amount (GST Included): ₹"+finalAmount);
    }
}
