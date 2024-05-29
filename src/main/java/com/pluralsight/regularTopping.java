package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class regularTopping extends Topping {
    private static final List<regularTopping> regularToppingOptions = new ArrayList<>();
    public regularTopping(String name) {
        super(name, false);
    }
    static {
        regularToppingOptions.add(new regularTopping("Lettuce"));
        regularToppingOptions.add(new regularTopping("Peppers"));
        regularToppingOptions.add(new regularTopping("Onions"));
        regularToppingOptions.add(new regularTopping("Tomatoes"));
        regularToppingOptions.add(new regularTopping("Jalapenos"));
        regularToppingOptions.add(new regularTopping("Cucumbers"));
        regularToppingOptions.add(new regularTopping("Pickles"));
        regularToppingOptions.add(new regularTopping("Guacamole"));
        regularToppingOptions.add(new regularTopping("Mushrooms"));
    }


    public static List<regularTopping> getRegularToppingOptions() {
        return regularToppingOptions;
    }

    @Override
    public String toString() {
        return getName();
    }
}



