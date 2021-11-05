package Grocery;

import util.Input;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class GroceryApplication {


    // add an item
    public static void addItem(HashMap<String, Integer> category, String item, int amount){
        category.put(item, amount);
    }

    public static void getItems(HashMap<String, Integer> category) {
        for (Map.Entry<String, Integer> item: category.entrySet()){
            System.out.println(item);
        }
    }


    public static void main(String[] args) {
        HashMap<String, Integer> Dairy = new HashMap<>();
        HashMap<String, Integer> Meat = new HashMap<>();
        HashMap<String, Integer> Frozen = new HashMap<>();

        addItem(Meat, "Steak", 5);
        addItem(Meat, "Brisket", 1);

        System.out.println(Meat);

        getItems(Meat);


//        Input input = new Input();
//        System.out.print("Would you like to create a grocery list? [Y/N]");
//        boolean userInput = input.yesNo();
//        System.out.println();
//
//        HashMap<String, HashMap<String, Integer>> groceries = new HashMap<>();
//
//
//        HashMap<String, Integer> listItem = new HashMap<>();
//
//        listItem.put("Milk", 3);
//
//        groceries.put("Dairy", listItem);
//
//        listItem.put("Sour cream", 1);
//
//        groceries.put("Dairy", listItem);
//        System.out.println("groceries.get(\"Dairy\") = " + groceries.get("Dairy"));
//
//        listItem.clear();
//        listItem.put("steak", 2);
//        groceries.put("Meat", listItem);
//        System.out.println("groceries.get(\"Meat\") = " + groceries.get("Meat"));
//        System.out.println("groceries = " + groceries);
//
//        System.out.println("groceries.get(\"Dairy\") = " + groceries.get("Dairy"));









    }
}
