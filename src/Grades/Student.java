package Grades;

import java.util.ArrayList;

public class Student {

    // properties
    private String name;
    public ArrayList<Integer> grades;

    // constructors
    public Student (String studentName) {
        this.name = studentName;
//        this.grades = studentGrades;
        this.grades = new ArrayList<>();
    }
//    public ArrayList<Integer> getGrades() {
//        return this.grades;
//    }
    public Student(){}

    // getters
    public String getName() {
        return this.name;
    }
    // add a grade
    public void addGrade (int grade) {
        this.grades.add(grade);
    }
    // returns average grade
    public double getGradeAverage() {
        double sumOfGrades = 0;
        for (int grade: this.grades) {
            sumOfGrades += grade;
        }
        return Math.round(sumOfGrades/this.grades.size());
    }
    // returns sum of all grades
    public double getSumOfGrades() {
        double sumOfGrades = 0;
        for (int i : this.grades) {
            sumOfGrades += i;
        }
        return sumOfGrades;
    }

    public double getClassAverage(int classSize, double sumOfGrades) {
        return sumOfGrades / classSize;
    }








    public static void main(String[] args) {
//        Student jackie = new Student("Jackie", new ArrayList<>());
//
//        jackie.grades.add(89);
//        System.out.println(jackie.grades);
//        jackie.grades.add(88);
//        jackie.grades.add(74);
//        System.out.println("jackie.getGradeAverage() = " + jackie.getGradeAverage());
    }




}
