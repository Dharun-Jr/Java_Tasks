package com.ecommerce.main;
import com.ecommerce.model.*;
import com.ecommerce.service.*;;
public class MainApp {
    public static void main(String[] args){
        CartService cart = new CartService();
        Product p1 = new Product(1, "Iphone 18", 1000);
        Product p2 = new Product(2, "Xiaomi 18", 100);
        cart.addProduct(p1);
        cart.addProduct(p2);
        cart.showCart();
        int totalAmount = cart.calculateTotal();
        System.out.println("TotalAmount: $" + totalAmount);
    }
}
