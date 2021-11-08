package Bookstore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class BookStore {

    public void buyRandomBook() {

    }

    public static void main(String[] args) {

        // created authors
        Author jkrowling = new Author("J.K. Rowling");
        Author stephenking = new Author("Stephen King");
        Author jackiedallas = new Author("Jackie Dallas");

        // create books
        ArrayList<Book> bookInventory = new ArrayList<>();

        Book harryPotter1 = new Book(jkrowling.name, "Harry Potter and the Sorcerer's Stone", 6.98);
        Book codeToGreatness = new Book(jackiedallas.name, "Code to Greatness", 9.99);
        Book itNovel = new Book(stephenking.name, "It: A Novel", 15.98);
        Book christmasPig = new Book(jkrowling.name, "The Christmas Pig", 14.99);
        Book bSummers = new Book(stephenking.name, "Billy Summers", 17.98);

        bookInventory.add(harryPotter1);
        bookInventory.add(itNovel);
        bookInventory.add(codeToGreatness);
        bookInventory.add(christmasPig);
        bookInventory.add(bSummers);

        // array list for customers
        ArrayList<Customer> customers = new ArrayList<>();

        // customers
        Customer customer1 = new Customer("Ian");
        Customer customer2 = new Customer("Adamina");
        Customer customer3 = new Customer("Nick");
        Customer customer4 = new Customer("Rhiannon");
        Customer customer5 = new Customer("Kenneth");
        Customer customer6 = new Customer("Zack");
        Customer customer7 = new Customer("Kayla");
        Customer customer8 = new Customer("Nadia");

//        HashMap<String, HashMap<String, HashMap<String, Double>>> customerOne = new HashMap<>();
//        customerOne.put(customer1.name, codeToGreatness.author, codeToGreatness.title, codeToGreatness.price);
//        System.out.println(customerOne);

        // add customers to array list
        customers.add(customer1);
        customers.add(customer2);
        customers.add(customer3);
        customers.add(customer4);
        customers.add(customer5);
        customers.add(customer6);
        customers.add(customer7);
        customers.add(customer8);

        Random rand = new Random();
        for (Customer customer : customers) {
            int randomBookIndex = rand.nextInt(bookInventory.size());
            Book randomBook = bookInventory.get(randomBookIndex);
            System.out.printf("%s bought \"%s\", by %s for $%s.\n", customer.name, randomBook.title, randomBook.author, randomBook.price);

        }


    }
}
