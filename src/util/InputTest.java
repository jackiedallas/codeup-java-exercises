package util;


import java.util.Scanner;

public class InputTest {


    public static void main(String[] args) {
//        System.out.print("Are you over the age of 21? ");
//
        Input input = new Input();
//        String userInput = input.getString();
//        System.out.println("userInput = " + userInput);

//        System.out.print("10 < 5 [Y/N] ");
//        boolean userInput2 = input.yesNo();
//        System.out.println("userInput2 = " + userInput2);

//        System.out.println("input.getInt(1, 10) = " + input.getInt(1, 10));
//        System.out.println("input.getDouble(1.00, 1.50) = " + input.getDouble(1.00, 1.50));
        input.getDouble(1.00, 5.00);
        System.out.println("input.getDouble() = " + input.getDouble());
    }
}