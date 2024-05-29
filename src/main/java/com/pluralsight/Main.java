package com.pluralsight;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("........Welcome to our DELIcious app!!:)........ ");
        System.out.print("Would you like to place and order (Y/N): ");
       String choice = scanner.nextLine();
       if(choice.equalsIgnoreCase("Y")){
           System.out.println(".......Welcome to the Order Screen!!........");
           System.out.println("what would you like to order today");
           System.out.println(" 1. Sandwich");
           System.out.println(" 2. Drink");
           System.out.println(" 3. Chips");
           System.out.print("choose an option: ");
           int orderOption = scanner.nextInt();
           scanner.nextLine();
           switch (orderOption){
               case 1:
                 orderSandwich();
                   break;
               case 2:

               case 3:

           }

       }
    }
    private static void orderSandwich(){
        System.out.println("Sizes available:");
        System.out.println("1. " + Size.Inch4.getName() + " - $" + Size.Inch4.getPrice());
        System.out.println("2. " + Size.Inch8.getName() + " - $" + Size.Inch8.getPrice());
        System.out.println("3. " + Size.Inch12.getName() + " - $" + Size.Inch12.getPrice());
        System.out.print("What size sandwich would you like?..(ex:4 inches): ");
        String sandwichSize = scanner.nextLine();
        System.out.println("These are our bread options");
        System.out.println(Bread.getBreadTypes());
        System.out.print("What bread would you like: ");
        String breadChoice = scanner.nextLine();
        System.out.print("Would you like to add a Protein? (Y/N): ");
        String proteinChoice1 = scanner.nextLine();
        if(proteinChoice1.equalsIgnoreCase("Y"))
        {
            System.out.println("Here is our Protein options");
            System.out.println(Meat.getMeatOptions());
            String proteinChoice = scanner.nextLine();
        } else{
            System.out.println("no Protein selected");
        }
        System.out.print("Would you like to add Cheese? (Y/N): ");
         String cheeseChoice1 = scanner.nextLine();
         if(cheeseChoice1.equalsIgnoreCase("Y")) {
             System.out.println("our cheese options");
             System.out.println(Cheese.getCheeseOptions());
             System.out.println("What kind of cheese would you like: ");
             String cheeseChoice = scanner.nextLine();
         }else{
             System.out.println("no Cheese Selected");
         }
        System.out.println("");

}
}
