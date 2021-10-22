import java.util.Scanner;


public class ConsoleExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);




        double pi = 3.14159;
        String mathString = "PI is approximately:";
        System.out.format("%s %.2f%n",mathString, pi); // 'n' creates new line like "\n"

        System.out.print("How old is your mom? ");
        int userInput0 = scanner.nextInt();
        System.out.print("How old are you? ");
        int userInput = scanner.nextInt();

        System.out.printf("\nWow, you've survived %s years on Earth. Congratulations!", userInput);
        System.out.printf("\nYour mom is %s years young!", userInput0);
        System.out.print("\nYour mom was " + (userInput0 - userInput) + " when she gave birth to you.");

        System.out.println("\n------------------------------------");

        System.out.print("What is your favorite number? ");
        int userInput2 = scanner.nextInt();
        System.out.printf("Your favorite number is %s.", userInput2);


        scanner.nextLine();
        System.out.print("\nEnter the 3 keywords (no punctuation necessary, just the words and a single space between them): ");

        String userInputs = scanner.nextLine();
//        String userInput3 = scanner.next();
//        String userInput4 = scanner.next();
//        String userInput5 = scanner.next();
        System.out.printf("Correct, the keywords were: %s.",userInputs);


    }
}
