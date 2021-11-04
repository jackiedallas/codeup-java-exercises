package Interfaces_Abstract_Lecture;

public class Custodian extends Employee{

    public Custodian(String name, String department) {
        super(name, department);
    }

    public String work() {
        return "Maintaining building, cleaning up messes, and restocking.";
    }
}
