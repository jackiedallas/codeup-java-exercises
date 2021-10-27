import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
//        multiplication(5, 9);
//        addition(5, 9);
//        subtraction(20, 9);
//        division(50, 10);
//        modulus(4, 2);
//        getInteger(1, 10);
//        factorial(1, 10);
        System.out.print("Enter a number between 1 and 10: ");
        int userNumber = getInteger(1, 10);
        long factNum = factorial(userNumber);
        System.out.printf("%s! = %s", userNumber, factNum);

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
        userNum = sc.nextInt();
        boolean validNum = ((userNum <= max) && (userNum >= min));
        if (!validNum){
            System.out.println("Not a valid number.");
        }
        return userNum;
    }

    public static long factorial (int userInput) {
        long result = 1;
        for (int i = 1; i <= userInput ; i++) {
            result *= i;
        }
//        System.out.printf("Great, %s! = %s", userNum, result);
        return result;
    }
}
