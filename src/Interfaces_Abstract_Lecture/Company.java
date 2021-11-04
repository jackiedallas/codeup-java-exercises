package Interfaces_Abstract_Lecture;

public class Company {
    public static void main(String[] args) {

        Accountant dave = new Accountant("Dave", "Accounting");

        System.out.println("dave.work() = " + dave.work());
        System.out.println("dave.getDepartment() = " + dave.getDepartment());
        System.out.println("dave.getName() = " + dave.getName());

        Custodian larry = new Custodian("Larry", "Maintenance");

        System.out.println("larry.work() = " + larry.work());
        System.out.println("larry.getName() = " + larry.getName());
        System.out.println("larry.getDepartment() = " + larry.getDepartment());


    }
}
