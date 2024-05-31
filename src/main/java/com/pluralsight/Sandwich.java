package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class Sandwich extends OrderItem {
    private Size size;
    private Bread bread;
    private List<Topping> toppings;
    private double price;
    private boolean toasted;

    public Sandwich(String itemName, Size size, List<Topping> toppings, double price, boolean toasted) {
        super(itemName, size, toppings,price);
        this.size = size;
        this.bread = bread;
        this.toppings = new ArrayList<>();
        this.toasted = false;
    }




    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Bread getBread() {
        return bread;
    }

    public void setBread(Bread bread) {
        this.bread = bread;
    }

    public List<Topping> getToppings() {
        return toppings;
    }

    public void addTopping(Topping topping) {
        toppings.add(topping);
    }

    public boolean isToasted() {
        return toasted;
    }

    public void setToasted(boolean toasted) {
        this.toasted = toasted;
    }


    }


