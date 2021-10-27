import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
//        multiplication(5, 9);
//        addition(5, 9);
//        subtraction(20, 9);
//        division(50, 10);
//        modulus(4, 2);
        getInteger(1, 10);
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
        boolean isValid;
        do {

            boolean validNum;
            do {
                System.out.printf("Enter a number between %s and %s: ", min, max);
                userNum = sc.nextInt();
                validNum = ((userNum <= max) && (userNum >= min));
                if (validNum) {
                    System.out.printf("Great! %s was a perfect number!", userNum);
                }
            } while (!validNum);

            sc.nextLine();
            System.out.print("\nDo you want to continue? (Y/N) ");
            String anotherNumber = sc.nextLine();
            isValid = anotherNumber.equalsIgnoreCase("y");
        } while(isValid);
        return userNum;
    }
}
