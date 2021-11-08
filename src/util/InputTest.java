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
//        input.getDouble(1.00, 5.00);
//        System.out.println("input.getDouble() = " + input.getDouble());


//        int testInput = input.getInt("Enter an integer: ");
//        System.out.println("testInput = " + testInput);
//
//        double testInput2 = input.getDouble("enter a double value: ");
//        System.out.println("testInput2 = " + testInput2);

//        System.out.print("Enter a binary number: ");
//        String binaryStr = input.getString();
//        int binaryNum = input.getBinary(binaryStr);
//        System.out.println("binaryNum = " + binaryNum);

//        int testInput3 = input.getBinary("Enter a binary value:");
//        System.out.println("testInput3 = " + testInput3);

        int testInput4 = input.getHex("Enter a hex value: ");
        System.out.println("testInput4 = " + testInput4);
    }
}
