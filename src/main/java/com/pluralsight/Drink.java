package com.pluralsight;

public class Drink {
        private String name;
        private String size;
        private double price;

        public Drink(String name, String size, double price) {
            this.name = name;
            this.size = size;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public String getSize() {
            return size;
        }

        public double getPrice() {
            return price;
        }
    // Drinks
    Drink cokeSmall = new Drink("Coke", "Small", 2.00);
    Drink cokeMedium = new Drink("Coke", "Medium", 2.50);
    Drink cokeLarge = new Drink("Coke", "Large", 3.00);

    Drink pepsiSmall = new Drink("Pepsi", "Small", 2.00);
    Drink pepsiMedium = new Drink("Pepsi", "Medium", 2.50);
    Drink pepsiLarge = new Drink("Pepsi", "Large", 3.00);

    Drink spriteSmall = new Drink("Sprite", "Small", 2.00);
    Drink spriteMedium = new Drink("Sprite", "Medium", 2.50);
    Drink spriteLarge = new Drink("Sprite", "Large", 3.00);

    Drink waterSmall = new Drink("Water", "Small", 2.00);
    Drink waterMedium = new Drink("Water", "Medium", 2.50);
    Drink waterLarge = new Drink("Water", "Large", 3.00);

}


