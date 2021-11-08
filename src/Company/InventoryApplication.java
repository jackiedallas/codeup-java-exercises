package Company;

import util.Input;

import java.util.ArrayList;

public class InventoryApplication {

    ArrayList<Product> products = new ArrayList<>();


    public void showProducts() {
        for (Product product : products) {
            System.out.printf("Product is: %s", product.getName());
            System.out.printf("Company profit is: $%s", product.getProfit());
        }
    }

    public static Product makeUserProduct() {
        Input input = new Input();
        System.out.print("Enter product name: ");
        String name = input.getString();

        System.out.print("Enter the product's price: ");
        double price = input.getDouble();

        System.out.print("Enter the product's cost of production: ");
        double cost = input.getDouble();

        System.out.print("What type of product is this: ");
        String type = input.getString();

        return new Product(name, price, cost, type);
    }

    public Car userAddCar() {
        Input input = new Input();
        System.out.print("What is the name of the car: ");
        String name = input.getString();

        System.out.print("Enter the price of the car: ");
        double price = input.getDouble();

        System.out.print("What will the cost of production be: ");
        double cost = input.getDouble();

        System.out.print("What is the make of the car: ");
        String make = input.getString();

        System.out.print("What is the model of the car: ");
        String model = input.getString();

        System.out.print("What is the year of the car: ");
        int year = input.getInt();

        return new Car(name, price, cost, make, model, year);
    }

    public Subscription userSubscription() {
        Input input = new Input();
        System.out.print("What is the name of the subscription: ");
        String name = input.getString();

        System.out.print("What is the price of the subscription: ");
        double price = input.getDouble();

        System.out.print("What will the production cost be: ");
        double cost = input.getDouble();

        System.out.print("How many months will the subscription be for: ");
        int numberOfMonths = input.getInt();

        return new Subscription(name, price, cost, numberOfMonths);
    }

    public Shoe userShoe() {
        Input input = new Input();
        System.out.print("What is the name of the shoe: ");
        String name = input.getString();

        System.out.print("What is the price of the shoe: ");
        double price = input.getDouble();

        System.out.print("What will the production cost of this shoe be: ");
        double cost = input.getDouble();

        System.out.print("What size is the shoe: ");
        double size = input.getDouble();

        System.out.print("What style is the shoe: ");
        String style = input.getString();

        return new Shoe(name, price, cost, size, style);

    }
}
