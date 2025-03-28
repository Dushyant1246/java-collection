package com.bridgelabz.shoppingCart;

public class MainShopping {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        // Adding products
        cart.addProduct("Laptop", 1200.00);
        cart.addProduct("Phone", 800.00);
        cart.addProduct("Tablet", 500.00);
        cart.addProduct("Headphones", 200.00);

        // Adding items to cart
        cart.addItemToCart("Laptop");
        cart.addItemToCart("Phone");
        cart.addItemToCart("Tablet");

        cart.displayCartInOrder();
        cart.displaySortedCart();
    }
}
/*
Cart in Order of Addition:
Laptop: $1200.0
Phone: $800.0
Tablet: $500.0

Cart Sorted by Price:
Tablet: $500.0
Phone: $800.0
Laptop: $1200.0
 */