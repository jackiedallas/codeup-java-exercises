package Interfaces_Abstract_Lecture;

public class Custodian extends Employee{

    public Custodian(String name, String department) {
        super(name, department);
    }

    public String work() {
        return "maintaining building, cleaning up messes, and restocking.";
    }

    @Override
    public String morningMeeting() {
        return "Custodians have a direct report to the head of the maintenance department. They schedule meetings as necessary.";
    }

    @Override
    public String lunchTime() {
        return "12:00 - 1:00";
    }

    @Override
    public int dailyPay() {
        return 100;
    }


}
