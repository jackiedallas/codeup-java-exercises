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
}
