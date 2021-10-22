import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double pi = 3.14159;
        String mathString = "PI is:";
        System.out.printf("%s %s \n",mathString, pi);

        System.out.print("How old are you? ");
        String userInput = scanner.nextLine();
        System.out.printf("Wow, you've survived %s years on Earth. Congratulations!", userInput);


    }
}
