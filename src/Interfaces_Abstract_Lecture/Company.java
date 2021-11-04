package Interfaces_Abstract_Lecture;

public class Company {
    public static void main(String[] args) {

        Accountant dave = new Accountant("Dave", "Accounting");
        Custodian larry = new Custodian("Larry", "Maintenance");

        System.out.println(dave.getName() + " is reporting for business for the " + dave.getDepartment() + " department.");

        System.out.println(larry.getName() + " is reporting for business for the " + larry.getDepartment() + " department.");

        System.out.println("Dave said " + dave.work());
        System.out.println("Larry was " + larry.work());

        System.out.println("Dave's morning: " + dave.morningMeeting());
        System.out.println("Larry's morning: " + larry.morningMeeting());

        System.out.println("Dave's lunch: " + dave.lunchTime());
        System.out.println("Larry's lunch: " + larry.lunchTime());

        System.out.println("Dave's pay: $" + dave.dailyPay() + " per day.");
        System.out.println("Larry's pay: $" + larry.dailyPay() + " per day.");


    }
}
