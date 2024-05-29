package com.pluralsight;

public class Size {
        private String name;
        private double price;


        private Size(String name, double price) {
            this.name = name;
            this.price = price;
        }


        public static final Size Inch4 = new Size("4 inches", 4.99);
        public static final Size Inch8 = new Size("8 inches", 6.99);
        public static final Size Inch12 = new Size("12 inches", 8.99);


        public String getName() {
            return name;
        }

        public double getPrice() {
            return price;
        }
}


