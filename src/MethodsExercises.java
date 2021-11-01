import util.Input;

import java.util.Scanner;
import java.lang.Math;

public class MethodsExercises {
    public static void main(String[] args) {
//        multiplication(5, 9);
//        addition(5, 9);
//        subtraction(20, 9);
//        division(50, 10);
//        modulus(4, 2);
        System.out.println("getInteger(1, 10) = " + getInteger(1, 10));
        factorial2();
//        factorial(1, 10);
//        System.out.print("Enter a number between 1 and 10: ");
//        int userNumber = getInteger(1, 10);
//        long factNum = factorial(userNumber);
//        System.out.printf("%s! = %s", userNumber, factNum);

//        System.out.println(randomNumber());
//        diceRoll();

    }

    public static int addition(int x, int y) {
        System.out.println(x + y);
        return x + y;
    }

    public static int subtraction(int x, int y) {
        System.out.println(x - y);
        return x - y;
    }

    public static int multiplication(int x, int y) {
        int result = 0;
        for (int i = 1; i <= y; i++) {
            result += x;
        }
        System.out.println(result);
        return result;
    }

    public static float division (int x, int y) {
        if (y == 0) {
            System.out.println("Error, cannot divide by zero");
        }
        float result = ((float)x)/y;
        System.out.println(result);
        return result;
    }

    public static int modulus (int x, int y) {
        System.out.println(x % y);
        return x % y;
    }

    public static int getInteger(int min, int max) {
        int userNum;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 10: ");
        userNum = sc.nextInt();
        boolean validNum = ((userNum <= max) && (userNum >= min));
        if (validNum){
            return userNum;
        }
        System.out.println("Number not valid...");
        return getInteger(min, max); // recursion
    }

    public static void factorial2() {
        Scanner scanner = new Scanner(System.in);

        int userInput;
        String isContinue;
        long factorial = 1;
        String middle = "1";

        do {

            userInput = getInteger(1, 10);
            for (int i = 1; i <= userInput; i++) {
                if(i > 1) {
                    middle += "x" + i;
                }
                factorial *= i;

                System.out.printf("%2d! = %-45s = %d%n", i, middle, factorial);
            }


            System.out.print("Would you like to go again? (y/n) ");
            isContinue = scanner.nextLine();
        } while(isContinue.equalsIgnoreCase("y"));
    }

    public static long factorial (int userInput) {
        long result = 1;
        for (int i = 1; i <= userInput ; i++) {
            result *= i;
        }
//        System.out.printf("Great, %s! = %s", userNum, result);
        return result;
    }

    public static int randomNumber(int numOfSides){
        int min = 1;
        int range = numOfSides - min + 1;
        int random = 0;
        for (int i = 0; i < 6; i++) {
            random = (int)(Math.random() * range) + min;
        }
        return random;
    }

    public static void diceRoll() {
        Scanner sc = new Scanner(System.in);
        boolean confirm;
        do {

            System.out.print("Enter a number of sides for a pair of dice: ");
            int numOfSides = sc.nextInt();
            System.out.println("Your first dice rolled a " + randomNumber(numOfSides));
            System.out.println("Your second dice rolled a " + randomNumber(numOfSides));


            sc.nextLine();
            System.out.print("Do you want to roll again? [Y/N] ");
            String rollAgain = sc.nextLine();
            confirm = rollAgain.equalsIgnoreCase("y");
        } while (confirm);


    }




}
