package Interfaces_Abstract_Lecture;

public class Accountant extends Employee {


    public Accountant(String name, String department) {
        super(name, department);
    }

    public String work() {
        return "TPS reports have been drafted.";
    }

    @Override
    public String morningMeeting() {
        return "Accountants have morning meetings beginning at 8:15 - 8:45 AM.";
    }

    @Override
    public String lunchTime() {
        return "Accountants take their lunch at their desk when they want to.";
    }

    @Override
    public int dailyPay() {
        return 500;
    }


}
