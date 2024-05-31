package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

import static com.pluralsight.Size.*;
public class Drink extends OrderItem {
    private String name;

    public Drink(String name, Size size) {
        super(name, size, calculateDrinkPrice(size));
        this.name = name;
    }

    public String getName() {
        return name;
    }


    private static final List<Drink> drinkOptions = new ArrayList<>();

    static {
        drinkOptions.add(new Drink("Coke", null));
        drinkOptions.add(new Drink("Pepsi", null));
        drinkOptions.add(new Drink("Sprite", null));
        drinkOptions.add(new Drink("Water", null));
        drinkOptions.add(new Drink("Iced Tea", null));
        drinkOptions.add(new Drink("Lemonade", null));
        drinkOptions.add(new Drink("Orange Juice", null));
    }

    public static List<Drink> getDrinkOptions() {
        return drinkOptions;
    }
    static double calculateDrinkPrice(Size size) {
        if (size != null) {
            if (size.equals(Small)) {
                return 2.00;
            } else if (size.equals(Medium)) {
                return 2.50;
            } else if (size.equals(Large)) {
                return 3.00;
            }
            return 0.00;
        }
        return 0.00;
    }

    @Override
    public String toString() {
        return getName();
    }
}


