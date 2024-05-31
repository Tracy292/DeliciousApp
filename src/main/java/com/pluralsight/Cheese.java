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
    private static final double BasePrice4Inch = 0.75;
    private static final double BasePrice8Inch = 1.50;
    private static final double BasePrice12Inch = 2.25;
    private static final double ExtraCheesePrice = 0.30;
    public static double calculateCheesePrice(Size size) {
        double basePrice = 0.0;

        switch (size.getName().toLowerCase()) {
            case "4 inches":
                basePrice = BasePrice4Inch;
                break;
            case "8 inches":
                basePrice = BasePrice8Inch;
                break;
            case "12 inches":
                basePrice = BasePrice12Inch;
                break;
            default:
                System.out.println("Invalid size selection for cheese.");
                return
              basePrice;
        }


        return
       basePrice;
    }

    @Override
    public String toString() {
        return getName();
    }
}



