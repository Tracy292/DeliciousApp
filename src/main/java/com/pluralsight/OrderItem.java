package com.pluralsight;

import java.util.List;


import java.util.List;

public class OrderItem {
    protected String itemName;
    protected Size size;
    protected List<Topping> toppings;
    protected double price;

    public OrderItem(String itemName, Size size, List<Topping> toppings, double price) {
        this.itemName = itemName;
        this.size = size;
        this.toppings = toppings;
        this.price = price;
    }

    public OrderItem(String itemName, Size size, double price) {
        this.itemName = itemName;
        this.size = size;
        this.price = price;
    }

    public OrderItem(String itemName, double price) {
        this.itemName = itemName;
        this.price = price;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Size getItemSize() {
        return size;
    }

    public void setItemSize(String size) {
        this.size = Size.parseSize(size);
    }

    public List<Topping> getItemsToppings() {
        return toppings;
    }

    public void setToppings(List<Topping> toppings) {
        this.toppings = toppings;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}



