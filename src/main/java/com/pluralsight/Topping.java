package com.pluralsight;

public class Topping {
        private String name;
        private boolean isPremium;

        public Topping(String name, boolean isPremium) {
            this.name = name;
            this.isPremium = isPremium;
        }

        public String getName() {
            return name;
        }

        public boolean isPremium() {
            return isPremium;
        }
}


