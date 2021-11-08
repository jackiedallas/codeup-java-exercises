package Grades;

import java.util.*;

public class GradesApplication {
    public static void openingStatement() {



        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Cream of the Crop Academy!");
        System.out.println();
        System.out.println("Our Academy consist of 4 amazing students:");
        System.out.println();
        System.out.println("|tokenCoding| |iansLame| |minaGoat| |covidFree|");
        System.out.println();
        System.out.println("""
                        Would you like to do: \s\040
                        1. See a specific student\040
                        2. View all grades
                        3. Leave""");

        int userChoice = scanner.nextInt();

        switch (userChoice) {
            case 1 -> specificStudent();
//            case 2 -> {
//                for (int i = 0; i < students.size(); i++) {
//
//                }
//            }
            case 3 -> closingStatement();
            default -> {
                System.out.println("Invalid response");
                openingStatement();
            }
        }


    }

    public static void closingStatement(){
        System.out.println("Thanks for visiting Cream of the Crop Academy, have a blessed and prosperous day!");
    }

    public static void specificStudent(){
        Scanner scanner = new Scanner(System.in);
        boolean confirm;
        do {
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
            double jackieSumOfGrades = jackie.getSumOfGrades();

            ian.addGrade(100);
            ian.addGrade(75);
            ian.addGrade(85);
            ian.addGrade(90);
            double iansAverage = ian.getGradeAverage();
            double ianSumOfGrades = ian.getSumOfGrades();

            adamina.addGrade(99);
            adamina.addGrade(79);
            adamina.addGrade(89);
            adamina.addGrade(69);
            double adaminasAverage = adamina.getGradeAverage();
            double adaminaSumOfGrades = adamina.getSumOfGrades();

            nick.addGrade(88);
            nick.addGrade(98);
            nick.addGrade(78);
            nick.addGrade(92);
            double nicksAverage = nick.getGradeAverage();
            double nickSumOfGrades = nick.getSumOfGrades();

            // adding students to hashmap
            students.put("tokenCoding", jackie);
            students.put("iansLame", ian);
            students.put("minaGoat", adamina);
            students.put("covidFree", nick);



            System.out.print("Which student would you like to see? ");
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
                default -> {
                    System.out.println("That student doesn't exist.");
                    specificStudent();
                }
            }

            System.out.print("\nWould you like to see another student? [Y/N] ");
            String userContinue = scanner.nextLine();
            confirm = userContinue.equalsIgnoreCase("y");
        } while(confirm);
        closingStatement();

    }

//    public static void seeAllGrades(ArrayList<S>){
//
//        TreeMap<String, Integer> studentGrades = new TreeMap<>();
//        for (Map.Entry<String, Integer> grade: studentGrades.entrySet()) {
//            System.out.println(grade);
//        }
//    }



    public static void main(String[] args) {
        openingStatement();
    }

}
