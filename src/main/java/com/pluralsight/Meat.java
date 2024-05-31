package com.pluralsight;

import java.util.ArrayList;
import java.util.List;
import com.pluralsight.Size;

import static com.pluralsight.Size.*;

public class Meat extends Topping {
    public Meat(String name) {
        super(name, true);
    }

    private static final List<Meat> meatOptions = new ArrayList<>();

    static {
        meatOptions.add(new Meat("Steak"));
        meatOptions.add(new Meat("Ham"));
        meatOptions.add(new Meat("Salami"));
        meatOptions.add(new Meat("Roast Beef"));
        meatOptions.add(new Meat("Chicken"));
        meatOptions.add(new Meat("Bacon"));
        meatOptions.add(new Meat("Plant based bacon"));
        meatOptions.add(new Meat("Plant based Ham"));
    }

        public double calculatePrice(Size size, boolean extra) {
            double basePrice = 0.0;
            if (size.equals(Inch4)) {
                basePrice = 1.0;
            } else if (size.equals(Inch8)) {
                basePrice = 2.0;
            } else if (size.equals(Inch12)) {
                basePrice = 3.0;
            }


            if (extra) {
                basePrice += 0.50;
            }

            return basePrice;
        }

    public static List<Meat> getMeatOptions() {
        return meatOptions;
    }

    @Override
    public String toString() {
        return getName();
    }
}





