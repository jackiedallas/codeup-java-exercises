package Grocery;

import util.Input;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class GroceryApplication {




    // add an item
    public static void addItem(HashMap<String, Integer> category, String item, int amount){
        category.put(item, amount);
    }


    // print out items, stackoverflow link kenneth sent
    public static void getItems(HashMap<String, Integer> category) {
        TreeMap<String, Integer> sortItems = new TreeMap<>(category);
        for (Map.Entry<String, Integer> item: sortItems.entrySet()){
            System.out.println(item);
        }
    }


    public static void main(String[] args) {
        Input input = new Input();

        HashMap<String, Integer> Bakery = new HashMap<>();
        HashMap<String, Integer> Household = new HashMap<>();
        HashMap<String, Integer> Dairy = new HashMap<>();
        HashMap<String, Integer> Meat = new HashMap<>();
        HashMap<String, Integer> Frozen = new HashMap<>();

//        addItem(Meat, "Steak", 5);
//        addItem(Meat, "Brisket", 1);
//
//        addItem(Frozen, "Toaster Strudels", 8);
//
//        System.out.println(Meat);
//        System.out.println(Frozen);
//        getItems(Frozen);
//        getItems(Meat);

        System.out.print("Would you like to create a grocery list? [Y/N] ");
        boolean userInput = input.yesNo();
        input.getString();

        if (userInput) {
            boolean confirm;
            do {
                boolean addMoreGroceries;
                do{
                    System.out.println("""
                        Choose a category to add groceries to:\s
                        1. Bakery
                        2. Household
                        3. Dairy
                        4. Meat
                        5. Frozen
                        """);

                    int userChoice = input.getInt();

                    // clearing scanner
                    input.getString();

                    System.out.print("Enter the name of the item: ");
                    String userItemName = input.getString();
                    System.out.print("Enter the amount of the item you want: ");
                    int userItemAmount = input.getInt();

                    // switch case for user choice
                    switch (userChoice) {
                        case 1 -> addItem(Bakery, userItemName, userItemAmount);
                        case 2 -> addItem(Household, userItemName, userItemAmount);
                        case 3 -> addItem(Dairy, userItemName, userItemAmount);
                        case 4 -> addItem(Meat, userItemName, userItemAmount);
                        case 5 -> addItem(Frozen, userItemName, userItemAmount);
                        default -> System.out.println("Not a valid choice.");
                    }

                    // clearing scanner
                    input.getString();

                    System.out.print("Do you want to add more groceries? [Y/N] ");
                    String userAddMore = input.getString();
                    addMoreGroceries = userAddMore.equalsIgnoreCase("y");
                } while(addMoreGroceries);

                System.out.print("Do you want to continue? [Y/N] ");
                String userCont = input.getString();
                confirm = userCont.equalsIgnoreCase("y");
            } while(confirm);
        }


        System.out.println("Here is a summary of all of your list items: ");

        getItems(Bakery);
        getItems(Household);
        getItems(Dairy);
        getItems(Meat);
        getItems(Frozen);



    }
}
