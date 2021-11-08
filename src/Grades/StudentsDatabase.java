package Grades;

import java.util.ArrayList;
import java.util.HashMap;

public class StudentsDatabase {
    public static HashMap<String, Student> getAll() {
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

        return students;
    }
}
