package com.pluralsight;

public class Bread {
        private String type;
        private Bread(String type) {
            this.type = type;
        }

        public static Bread WHITE = new Bread("White");
        public static Bread RYE = new Bread("Rye");
        public static Bread WHEAT = new Bread("Wheat");
        public static Bread WRAP = new Bread("Wrap");

        // Getter method to access the type of each bread
        public String getType() {
            return type;
        }
}


