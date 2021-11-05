package Grades;

import java.util.ArrayList;

public class Student {

    // properties
    private String name;
    private ArrayList<Integer> grades;

    // constructors
    public Student (String studentName, ArrayList<Integer> studentGrades) {
        this.name = studentName;
        this.grades = studentGrades;
    }

    // getters
    public String getName() {
        return this.name;
    }
    // add a grade
    public void addGrade (int grade) {
        grades.add(grade);
    }
    // returns average grade
    public double getGradeAverage() {
        double sumOfGrades = 0;
        for (int i: grades) {
            sumOfGrades += i;
        }
        return Math.round(sumOfGrades/grades.size());
    }

    public static void main(String[] args) {
        Student jackie = new Student("Jackie", new ArrayList<>());

        jackie.grades.add(89);
        System.out.println(jackie.grades);
        jackie.grades.add(88);
        jackie.grades.add(74);
        System.out.println("jackie.getGradeAverage() = " + jackie.getGradeAverage());
    }




}
