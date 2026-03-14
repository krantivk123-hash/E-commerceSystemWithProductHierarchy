
package com.ecommerce;

import java.util.Scanner;
import com.ecommerce.products.*;
import com.ecommerce.cart.*;
import com.ecommerce.orders.*;

public class Main {

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        ElectronicsProduct phone=new ElectronicsProduct(
            "E001","Smartphone X",50000,"5G Smartphone",50,"TechBrand",24);

        ClothingProduct tshirt=new ClothingProduct(
            "C001","Cotton TShirt",1200,"Cotton Shirt",100,"M","Blue","Cotton");

        BookProduct book=new BookProduct(
            "B001","Java Programming",800,"Learn Java",75,"John Doe","978",400);

        ShoppingCart cart=new ShoppingCart();

        while(true){

            System.out.println("=== E-COMMERCE SYSTEM ===");
            System.out.println("1 View Products");
            System.out.println("2 Add Smartphone To Cart");
            System.out.println("3 View Cart");
            System.out.println("4 Checkout");
            System.out.println("5 Exit");

            int choice=sc.nextInt();

            switch(choice){

                case 1:
                    phone.displayInfo();
                    tshirt.displayInfo();
                    book.displayInfo();
                    break;

                case 2:
                    cart.addItem(phone,1);
                    System.out.println("Added Smartphone to cart");
                    break;

                case 3:
                    cart.displayCart();
                    break;

                case 4:
                    Order order=new Order(cart);
                    order.displayOrder();
                    break;

                case 5:
                    System.exit(0);
            }
        }
    }
}
