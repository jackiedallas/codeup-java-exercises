package Interfaces_Abstract_Lecture;

abstract class Employee implements DailyWork {
    protected String name;
    protected String department;

    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

//    public abstract String work();

//    public static void main(String[] args) {
//        Employee jackie = new Employee("jackie", "web dev")
    // CANNOT INSTANTIATE. CTE this is an abstract class
//    }
}
