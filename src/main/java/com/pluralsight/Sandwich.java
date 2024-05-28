package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class Sandwich {
    private Bread bread;
    private Size size;
    private List<Topping> toppings;
    private boolean toasted;

    public Sandwich(Bread bread, Size size) {
        this.bread = bread;
        this.size = size;
        this.toppings = new ArrayList<>();
        this.toasted = false; // By default, not toasted
    }

    public void addTopping(Topping topping) {
        toppings.add(topping);
    }

    public void setToasted(boolean toasted) {
        this.toasted = toasted;
    }

    public Bread getBread() {
        return bread;
    }

    public Size getSize() {
        return size;
    }

    public List<Topping> getToppings() {
        return toppings;
    }

    public boolean isToasted() {
        return toasted;
    }
}

