package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class Chips extends OrderItem {

    public Chips(String itemName, double price) {
        super(itemName, price);
    }

    public static class Chip {
        private String name;
        private double price;

        public Chip(String name, double price) {
            this.name = name;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public double getPrice() {
            return price;
        }
    }

    private static final List<Chip> chipOptions = new ArrayList<>();

    static {
        chipOptions.add(new Chip("Mesquite BBQ", 1.50));
        chipOptions.add(new Chip("Sour Cream and Onion", 1.50));
        chipOptions.add(new Chip("Jalapeno", 1.50));
        chipOptions.add(new Chip("Sea Salt and Vinegar", 1.50));
        chipOptions.add(new Chip("Baja Chipotle", 1.50));
        chipOptions.add(new Chip("Spicy Dill Pickle", 1.50));
        chipOptions.add(new Chip("Honey Mustard", 1.50));
    }

    public static List<Chip> getChipOptions() {
        return chipOptions;
    }

    @Override
    public String toString() {
        return getItemName();
    }
}
