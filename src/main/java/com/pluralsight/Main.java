package com.pluralsight;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static List<OrderItem> orderItems = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("........Welcome to our DELIcious app!!:)........ ");
        boolean continueOrdering = true;

        while (continueOrdering) {
            System.out.println("0) Exit");
            System.out.println("1) New Order");
            System.out.println("2. Checkout");
            System.out.print("Select an Option: ");

            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.println(".......Welcome to the Order Screen!!........");
                    order();
                    break;
                case 0:
                    continueOrdering = false;
                    System.out.println("Thank you for using our app. Goodbye!");
                    break;
                case 2:
                    checkout();
                    break;
                default:
                    System.out.println("Invalid option! Please try again.");
            }
        }
    }

    private static void order() {
        boolean continueOrdering = true;

        do {
            System.out.println("What would you like to order today?");
            System.out.println("1. Add Sandwich");
            System.out.println("2. Add Drink");
            System.out.println("3. Add Chips");
            System.out.println("0. Cancel Order");
            System.out.print("Choose an option: ");
            int orderOption = scanner.nextInt();
            scanner.nextLine();

            switch (orderOption) {
                case 1:
                    addSandwich();
                    break;
                case 2:
                    addDrink();
                    break;
                case 3:
                    addChips();
                    break;
                case 0:
                    System.out.println("Order canceled.");
                    return;
                default:
                    System.out.println("Invalid option!");
            }

            System.out.print("Would you like to add more items to your order? (Y/N): ");
            String continueOption = scanner.nextLine();
            continueOrdering = continueOption.equalsIgnoreCase("Y");
        } while (continueOrdering);
    }

    static Size sandwichSize;

    private static void addSandwich() {
        double totalPrice = 0.0;
        List<Topping> toppingsList = new ArrayList<>();

        do {
            System.out.println("Adding a Sandwich...");
            System.out.println("Sizes available:");
            System.out.println("1. " + Size.Inch4.getName() + " - $" + Size.Inch4.getSizePrice());
            System.out.println("2. " + Size.Inch8.getName() + " - $" + Size.Inch8.getSizePrice());
            System.out.println("3. " + Size.Inch12.getName() + " - $" + Size.Inch12.getSizePrice());
            System.out.print("What size sandwich would you like? (ex: 4 inches): ");
            String sandwichSizeInput = scanner.nextLine();
            sandwichSize = Size.parseSize(sandwichSizeInput);

            System.out.println("Here are our bread options:");
            System.out.println(Bread.getBreadTypes());
            System.out.print("Which bread would you like? ");
            String breadChoice = scanner.nextLine();
            toppingsList.add(new Bread(breadChoice));

            System.out.print("Would you like to add a protein? (Y/N): ");
            if (scanner.nextLine().equalsIgnoreCase("Y")) {
                do {
                    System.out.println("Here are our protein options:");
                    System.out.println(Meat.getMeatOptions());
                    System.out.print("Which protein option would you like: ");
                    String proteinChoice = scanner.nextLine();
                    toppingsList.add(new Meat(proteinChoice));
                    System.out.print("Would you like to add another piece of protein? (Y/N): ");
                } while (scanner.nextLine().equalsIgnoreCase("Y"));
            }

            System.out.print("Would you like to add cheese? (Y/N): ");
            if (scanner.nextLine().equalsIgnoreCase("Y")) {
                do {
                    System.out.println("These are our cheese options:");
                    System.out.println(Cheese.getCheeseOptions());
                    System.out.print("What kind of cheese would you like: ");
                    String cheeseChoice = scanner.nextLine();
                    toppingsList.add(new Cheese(cheeseChoice));
                    System.out.print("Would you like to add another piece of cheese? (Y/N): ");
                } while (scanner.nextLine().equalsIgnoreCase("Y"));
            }

            System.out.print("Would you like to add toppings? (Y/N): ");
            if (scanner.nextLine().equalsIgnoreCase("Y")) {
                do {
                    System.out.println("These are our toppings:");
                    System.out.println(regularTopping.getRegularToppingOptions());
                    System.out.print("Which topping would you like: ");
                    String toppingsChoice = scanner.nextLine();
                    toppingsList.add(new regularTopping(toppingsChoice));
                    System.out.print("Would you like to add another topping? (Y/N): ");
                } while (scanner.nextLine().equalsIgnoreCase("Y"));
            }

            System.out.print("Would you like to add sauces? (Y/N): ");
            if (scanner.nextLine().equalsIgnoreCase("Y")) {
                do {
                    System.out.println("Here are our sauces:");
                    System.out.println(sauces.getSauceOptions());
                    System.out.print("Which sauce would you like: ");
                    String sauceChoice = scanner.nextLine();
                    toppingsList.add(new sauces(sauceChoice));
                    System.out.print("Would you like to add another sauce? (Y/N): ");
                } while (scanner.nextLine().equalsIgnoreCase("Y"));
            }

            double currentPrice = calculateSandwichPrice(sandwichSize, toppingsList);
            totalPrice += currentPrice;

            System.out.print("Would you like to add another sandwich to your order? (Y/N): ");
        } while (scanner.nextLine().equalsIgnoreCase("Y"));

        System.out.println("The total price of your sandwich order is: $" + totalPrice);
        OrderItem sandwichOrder = new OrderItem("Sandwich", sandwichSize, toppingsList, totalPrice);
        orderItems.add(sandwichOrder);
    }

    private static double calculateSandwichPrice(Size size, List<Topping> toppingsList) {
        double basePrice;

        if (size == Size.Inch4) {
            basePrice = Size.Inch4.getSizePrice();
        } else if (size == Size.Inch8) {
            basePrice = Size.Inch8.getSizePrice();
        } else if (size == Size.Inch12) {
            basePrice = Size.Inch12.getSizePrice();
        } else {
            return 0.0;
        }

        double totalPrice = basePrice;

        for (Topping topping : toppingsList) {
            if (topping instanceof Meat) {
                Meat meat = (Meat) topping;
                totalPrice += meat.calculatePrice(size, false);
            } else if (topping instanceof Cheese) {
                Cheese cheese = (Cheese) topping;
                totalPrice += cheese.calculateCheesePrice(size);
            }
        }

        return totalPrice;
    }

    private static void addChips() {
        System.out.println("Here is our Variety of Chips:");
        System.out.println(Chips.getChipOptions());

        System.out.print("Which Chips would you like to order: ");
        String chipChoice = scanner.nextLine();

        Chips.Chip selectedChip = null;
        for (Chips.Chip chip : Chips.getChipOptions()) {
            if (chip.getName().equalsIgnoreCase(chipChoice)) {
                selectedChip = chip;
                break;
            }
        }

        if (selectedChip == null) {
            System.out.println("Invalid chip choice!");
            return;
        }

        double chipPrice = selectedChip.getPrice();

        System.out.println("The price of " + chipChoice + " is: $" + chipPrice);
    }

    private static void addDrink() {
        System.out.println("Here are our Drink options");
        System.out.println(Drink.getDrinkOptions());

        System.out.print("Which Drink would you like: ");
        String drinkChoice = scanner.nextLine();

        Drink selectedDrink = null;
        for (Drink drink : Drink.getDrinkOptions()) {
            if (drink.getName().equalsIgnoreCase(drinkChoice)) {
                selectedDrink = drink;
                break;
            }
        }

        if (selectedDrink == null) {
            System.out.println("Invalid drink choice!");
            return;
        }

        System.out.println("What size would you like:");
        System.out.println("1. Small");
        System.out.println("2. Medium");
        System.out.println("3. Large");
        System.out.print("Choose a size: ");
        int sizeOption = scanner.nextInt();
        scanner.nextLine();

        Size selectedSize;
        switch (sizeOption) {
            case 1:
                selectedSize = Size.Small;
                break;
            case 2:
                selectedSize = Size.Medium;
                break;
            case 3:
                selectedSize = Size.Large;
                break;
            default:
                System.out.println("Invalid size option!");
                return;
        }

        double sizePrice = selectedDrink.calculateDrinkPrice(selectedSize);

        System.out.println("The price of " + selectedSize.getName() + " " + drinkChoice + " is: $" + sizePrice);

        Drink drinkOrder = new Drink(selectedDrink.getName(), selectedSize);
        orderItems.add(drinkOrder);
    }

    private static void checkout() {
        if (orderItems.isEmpty()) {
            System.out.println("Your order is empty.");
        } else {
            System.out.println("Your Order:");
            for (int i = 0; i < orderItems.size(); i++) {
                OrderItem orderItem = orderItems.get(i);
                System.out.println((i + 1) + ". " + orderItem.getItemName() + " - Size: " + orderItem.getItemSize().getName());

                if (orderItem.getItemName().equalsIgnoreCase("Sandwich")) {
                    System.out.println("   Toppings:");
                    for (Topping topping : orderItem.getItemsToppings()) {
                        System.out.println("   - " + topping.getName());
                    }
                }
                System.out.println("   Price: $" + orderItem.getPrice());
                System.out.println();
            }
            double total = calculateTotalPrice();
            System.out.println("Total Price: $" + total);
            for (OrderItem orderItem : orderItems) {
                Receipt.generateReceipt(orderItem);
            }
        }
    }

    private static double calculateTotalPrice() {
        double total = 0.0;
        for (OrderItem orderItem : orderItems) {
            total += orderItem.getPrice();
        }
        return total;
    }
}



