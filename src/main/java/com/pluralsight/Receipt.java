package com.pluralsight;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;


public class Receipt {

    public static void generateReceipt(OrderItem orderItem) {
        createReceiptsFolder();

        String filename = generateFilename();

        System.out.println("Order Details:");
        System.out.println("Item Name: " + orderItem.getItemName());
        System.out.println("Price: $" + orderItem.getPrice());

        // Check if the item has toppings
        if (!orderItem.getItemsToppings().isEmpty()) {
            System.out.println("Toppings:");
            List<Topping> toppings = orderItem.getItemsToppings();
            for (Topping topping : toppings) {
                System.out.println("- " + topping.getName());
            }
        }

        try {
            FileWriter writer = new FileWriter("receipts/" + filename);
            writer.write("Order Details:\n");
            writer.write("Item Name: " + orderItem.getItemName() + "\n");
            writer.write("Price: $" + orderItem.getPrice() + "\n");

            if (!orderItem.getItemsToppings().isEmpty()) {
                writer.write("Toppings:\n");
                List<Topping> toppings = orderItem.getItemsToppings();
                for (Topping topping : toppings) {
                    writer.write("- " + topping.getName() + "\n");
                }
            }

            writer.close();
            System.out.println("Receipt generated: " + filename);
        } catch (IOException e) {
            System.out.println("Failed to generate receipt: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private static String generateFilename() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd-HHmmss");
        String timestamp = dateFormat.format(new Date());
        return timestamp + ".txt";
    }

    private static void createReceiptsFolder() {
        File folder = new File("receipts");
        if (!folder.exists()) {
            if (folder.mkdirs()) {
                System.out.println("Receipts folder created successfully.");
            } else {
                System.out.println("Failed to create receipts folder.");
            }
        }
    }
}
