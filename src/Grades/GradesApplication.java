package Grades;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // creating hashmap
        HashMap<String, Student> students = new HashMap<>();

        // creating students
        Student jackie = new Student("Jackie", new ArrayList<>());
        Student ian = new Student("Ian", new ArrayList<>());
        Student adamina = new Student("Adamina", new ArrayList<>());
        Student nick = new Student("Nick", new ArrayList<>());

        // adding grades
        jackie.addGrade(95);
        jackie.addGrade(85);
        jackie.addGrade(75);
        jackie.addGrade(65);
        double jackiesAverage = jackie.getGradeAverage();

        ian.addGrade(100);
        ian.addGrade(75);
        ian.addGrade(85);
        ian.addGrade(90);
        double iansAverage = ian.getGradeAverage();

        adamina.addGrade(99);
        adamina.addGrade(79);
        adamina.addGrade(89);
        adamina.addGrade(69);
        double adaminasAverage = adamina.getGradeAverage();

        nick.addGrade(88);
        nick.addGrade(98);
        nick.addGrade(78);
        nick.addGrade(92);
        double nicksAverage = nick.getGradeAverage();

        // adding students to hashmap
        students.put("tokenCoding", jackie);
        students.put("iansLame", ian);
        students.put("minaGoat", adamina);
        students.put("covidFree", nick);




        System.out.println("Welcome to Cream of the Crop Academy!");
        System.out.println();
        System.out.println("Our Academy consist of 4 amazing students:");
        System.out.println();



        boolean confirm;
        do {

            System.out.println("|tokenCoding| |iansLame| |minaGoat| |covidFree|");
            System.out.println();
            System.out.print("Which student would you like more info on? ");
            String userInput = scanner.nextLine();

            switch (userInput) {
                case "tokenCoding" -> System.out.printf("Name: %s - Github Username: tokenCoding\n" +
                        "Current Average: %s", jackie.getName(), jackiesAverage);
                case "iansLame" -> System.out.printf("Name: %s - Github Username: iansLame\n" +
                        "Current Average: %s", ian.getName(), iansAverage);
                case "minaGoat" -> System.out.printf("Name: %s - Github Username: minaGoat\n" +
                        "Current Average: %s", adamina.getName(), adaminasAverage);
                case "covidFree" -> System.out.printf("Name: %s - Github Username: covidFree\n" +
                        "Current Average: %s", nick.getName(), nicksAverage);
                default -> System.out.println("That student doesn't exist.");
            }

            System.out.print("\nWould you like to see another student? [Y/N] ");
            String userContinue = scanner.nextLine();
            confirm = userContinue.equalsIgnoreCase("y");
        } while(confirm);


        System.out.println("Thanks for visiting Cream of the Crop Academy, have a blessed and prosperous day!");
    }

}
