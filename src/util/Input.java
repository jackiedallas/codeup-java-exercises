package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input () {
        scanner = new Scanner(System.in);
    }

    public String getString() {
        return scanner.nextLine();
    }

    public boolean yesNo() {

        if (scanner.hasNext("y")) {
            return true;
        } else if (scanner.hasNext("yes")) {
            return true;
        } else if (scanner.hasNext("Y")) {
            return true;
        } else if (scanner.nextLine().equalsIgnoreCase("yes")) {
            return true;
        }
        return false;
    }

    public int getInt(int min, int max) {
        int userNum;
        do {
            System.out.printf("Enter a number between %s and %s: ", min, max);
            userNum = scanner.nextInt();
        } while((userNum > max) || (userNum < min));
        return userNum;

    }

    public int getInt() {
        return scanner.nextInt();
    }

    public double getDouble(double min, double max) {
        double userNum;
        do {
            System.out.printf("Enter a number between %s and %s: ", min, max);
            userNum = scanner.nextDouble();
        } while ((userNum > max) || (userNum < min));
        return userNum;
    }

    public double getDouble() {
        return scanner.nextDouble();
    }
}
