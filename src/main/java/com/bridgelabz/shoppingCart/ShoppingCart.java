package com.bridgelabz.shoppingCart;

import java.util.*;

public class ShoppingCart {
    private Map<String, Double> productPrices = new HashMap<>();
    private Map<String, Double> addedItems = new LinkedHashMap<>();
    private Map<String, Double> sortedItems = new TreeMap<>(Comparator.comparingDouble(productPrices::get));

    // Add product price
    public void addProduct(String product, double price) {
        productPrices.put(product, price);
    }

    // Add item to cart
    public void addItemToCart(String product) {
        if (productPrices.containsKey(product)) {
            addedItems.put(product, productPrices.get(product));
            sortedItems.put(product, productPrices.get(product));
        } else {
            System.out.println("Product not found!");
        }
    }

    // Display cart in insertion order
    public void displayCartInOrder() {
        System.out.println("\nCart in Order of Addition:");
        addedItems.forEach((product, price) -> System.out.println(product + ": $" + price));
    }

    // Display cart sorted by price
    public void displaySortedCart() {
        System.out.println("\nCart Sorted by Price:");
        sortedItems.forEach((product, price) -> System.out.println(product + ": $" + price));
    }
}
