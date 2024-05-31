package com.pluralsight;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;


public class Receipt {

    public static void generateReceipt(OrderItem orderItem) {
        createReceiptsFolder(); // Make sure the receipts folder exists

        String filename = generateFilename();

        try {
            FileWriter writer = new FileWriter("receipts/" + filename);
            writer.write("Order Details:\n");
            writer.write("Item Name: " + orderItem.getItemName() + "\n");
            writer.write("Size: " + orderItem.getItemSize().getName() + "\n");

            // Write toppings
            writer.write("Toppings:\n");
            List<Topping> toppings = orderItem.getItemsToppings();
            if (!toppings.isEmpty()) {
                for (Topping topping : toppings) {
                    writer.write("- " + topping.getName() + "\n");
                }
            } else {
                writer.write("No toppings added.\n");
            }

            writer.write("Price: $" + orderItem.getPrice() + "\n");
            writer.close();
            System.out.println("Receipt generated: " + filename);
        } catch (IOException e) {
            System.out.println("Failed to generate receipt: " + e.getMessage());
            e.printStackTrace(); // Print the stack trace for debugging
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

