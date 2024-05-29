package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class Cheese extends Topping {
    public Cheese(String name) {
        super(name, true);
    }
    private static final List<Cheese> cheeseOptions = new ArrayList<>();
     static {
        cheeseOptions.add(new Cheese("Cheddar"));
        cheeseOptions.add(new Cheese("Swiss"));
        cheeseOptions.add(new Cheese("Provolone"));
        cheeseOptions.add(new Cheese("Pepper Jack"));
        cheeseOptions.add(new Cheese("American"));
    }


    public static List<Cheese> getCheeseOptions() {
        return cheeseOptions;
    }

    @Override
    public String toString() {
        return getName();
    }
}


