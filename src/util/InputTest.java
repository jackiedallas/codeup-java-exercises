package util;


import java.util.Scanner;

public class InputTest {


    public static void main(String[] args) {
//        System.out.print("Are you over the age of 21? ");
//
        Input input = new Input();
//        String userInput = input.getString();
//        System.out.println("userInput = " + userInput);

        System.out.print("10 < 5 [Y/N] ");
        boolean userInput2 = input.yesNo();
        System.out.println("userInput2 = " + userInput2);

    }
}
