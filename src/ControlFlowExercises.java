import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

        // 1. Loop Basics
            // a. While
//            int i = 5;
//            while (i <= 15) {
//                System.out.print(i + " ");
//                i++;
//            }

            // b. Do While
//            int i = 2;
//            do {
//                System.out.println("Count is: " + i);
//                i += 2;
//            } while (i <= 100);

//            int i = 100;
//            do {
//                System.out.println("Count is: " + i);
//                i -= 5;
//            } while (i >= -10);

//            long i = 2;
//            do {
//
//                System.out.println("Count is: " + i);
//                i *= i;
//            } while (i <= 1000000);

        // c. For Loop
//        for (int i = 5; i <= 15; i++) {
//            System.out.println(i);
//        }

//        for (int i = 2; i <= 100 ; i += 2) {
//            System.out.println(i);
//        }
//
//        for (int i = 100; i >= -10; i -= 5) {
//            System.out.println(i);
//        }

//        for (long i = 2; i <= 1000000 ; i *= i) {
//            System.out.println(i);
//        }

//        for (int i = 1; i <= 100 ; i++) {
//            if ((i % 3 == 0) && (i % 5 == 0)) {
//                System.out.println("Fizzbuzz");
//            } else if (i % 3 == 0) {
//                System.out.println("Fizz");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            } else {
//                System.out.println(i);
//            }
//        }

        Scanner userInput = new Scanner(System.in);

        System.out.print("Would you like to enter a number? yes or no: ");
        String userResponse = userInput.nextLine();

        if (userResponse.equals("yes")) {
            System.out.print("Enter a number 1-100: ");
            int userNum = userInput.nextInt();
            System.out.print("Great, Here is a table of squares and cubes!");
            System.out.println("\nnumber | squared | cubed");
            System.out.print("------ | ------  | ------");
            for (int i = 1; i <= userNum; i++) {
                int squared = i*i;
                int cubed = i*i*i;
                String row = String.format("%-6d | %-7d | %d", i, squared,cubed);
//                System.out.println("\n" + i + " | " + (int)Math.pow(i, 2) + " | " + (int)Math.pow(i, 3));
                System.out.println("\n"+ row);
            }
        } else {
            System.out.println("No? That's ok, maybe another time.");
        }

        System.out.print("What is your overall grade for Codeup? ");
        int userGrade = userInput.nextInt();

//        if ((userGrade <= 100) && (userGrade >= 88)) {
//            System.out.println("Your letter grade is an A");
//        } else if (userGrade >= 80) {
//            System.out.println("Your letter grade is a B");
//        } else if (userGrade >= 67) {
//            System.out.println("Your letter grade is a C");
//        } else if (userGrade >= 60) {
//            System.out.println("Your letter grade is a D");
//        } else {
//            System.out.println("Your letter grade is a F");
//        }

        if ((userGrade <= 100) && (userGrade >= 88)) {
            if (userGrade >= 95) {
                System.out.println("Your letter grade is an A+");
            } else {
                System.out.println("Your letter grade is an A-");
            }
        } else if (userGrade >= 80) {
            if (userGrade >= 85) {
                System.out.println("Your letter grade is a B+");
            } else {
                System.out.println("Your letter is a B-");
            }
        } else if (userGrade >= 67){
            if (userGrade >= 75) {
                System.out.println("Your letter grade is a C+");
            } else {
                System.out.println("Your letter is a C-");
            }
        } else if (userGrade >= 60) {
            if (userGrade >= 63) {
                System.out.println("Your letter grade is a D+");
            } else {
                System.out.println("Your letter is a D-");
            }
        } else {
            System.out.println("Your letter grade is a F");
        }

       }
    }

