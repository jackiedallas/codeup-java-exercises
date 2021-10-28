public class Student {

    public String name;
    public String cohort;
    private double grade;

    public double shareGrade() {
        return grade;
    }

    // now let's add a constructor - what is it? a method of object creation

    public Student(String studentName) {
//        this.name = studentName;
//        this.cohort = "unassigned";

        // calling second constructor inside of constructor. it's using the second constructor's ability to handle a 2nd argument
        this(studentName, "unassigned");

    }
    public Student(String studentName, String studentCohort) {
        this.name = studentName;
        this.cohort = studentCohort;
    }

    public Student(String studentName, String studentCohort, double grade) {
        this.name = studentName;
        this.cohort = studentCohort;
        this.grade = grade;
    }

    public static void main(String[] args) {
        // Before constructors: [similar feel to JS?]
//        Student jackie = new Student();
//        jackie.name = "Jackie";
//        jackie.cohort = "Quasar";
//
//        System.out.printf("%s is in the %s cohort.", jackie.name, jackie.cohort);

        // first constructor experiment
        Student jackie = new Student("Jackie");

        System.out.println("jackie.name = " + jackie.name);
        System.out.println("jackie.cohort = " + jackie.cohort);

        System.out.println();

        // second constructor experiment
        Student ian = new Student("Ian", "Thanos");
        System.out.printf("%s is the student name and %s is their assigned cohort.", ian.name, ian.cohort);


        Student adamina = new Student("Adamina", "Deimos", 90.0);
        System.out.println();
        System.out.println("adamina.grade = " + adamina.grade);



    }

}
