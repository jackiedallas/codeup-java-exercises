import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double pi = 3.14159;
        String mathString = "PI is:";
        System.out.printf("%s %s \n",mathString, pi);

        System.out.print("How old is your mom? ");
        int userInput0 = scanner.nextInt();
        System.out.print("How old are you? ");
        int userInput = scanner.nextInt();

        System.out.printf("\nWow, you've survived %s years on Earth. Congratulations!", userInput);
        System.out.printf("\nYour mom is %s years young!", userInput0);
        System.out.print("\nYour mom was " + (userInput0 - userInput) + " when she gave birth to you.");


    }
}
