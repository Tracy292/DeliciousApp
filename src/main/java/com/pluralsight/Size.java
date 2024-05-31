package com.pluralsight;

public class Size {
        private String name;
        private double price;


        Size(String name, double price) {
            this.name = name;
            this.price = price;
        }


        public static final Size Inch4 = new Size("4 inches", 5.50);
        public static final Size Inch8 = new Size("8 inches", 7.00);
        public static final Size Inch12 = new Size("12 inches", 8.50);
          public static final Size Small = new Size("Small", 2.00);
          public static final Size Medium = new Size("Medium", 2.50);
          public static final Size Large = new Size("Large", 3.00);



    public String getName() {
            return name;
        }

        public double getSizePrice() {
            return price;
        }
    public static Size parseSize(String input) {
        switch (input.trim().toLowerCase()) {
            case "4 inches":
                return Inch4;
            case "8 inches":
                return Inch8;
            case "12 inches":
                return Inch12;
            case "small":
                return Small;
            case "medium":
                return Medium;
            case "large":
                return Large;
            default:
                throw new IllegalArgumentException("Invalid size: " + input);
        }


}}


