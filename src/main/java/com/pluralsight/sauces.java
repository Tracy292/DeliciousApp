package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class sauces extends Topping {
    private static final List<sauces> sauceOptions = new ArrayList<>();

    static {
        sauceOptions.add(new sauces("Mayo"));
        sauceOptions.add(new sauces("Mustard"));
        sauceOptions.add(new sauces("Ketchup"));
        sauceOptions.add(new sauces("Ranch"));
        sauceOptions.add(new sauces("Thousand Islands"));
        sauceOptions.add(new sauces("Vinaigrette"));
    }

    public sauces(String name) {
        super(name, false);
    }

    public static List<sauces> getSauceOptions() {
        return sauceOptions;
    }
}
