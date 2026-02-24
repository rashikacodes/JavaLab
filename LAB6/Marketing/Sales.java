package Marketing;

import General.Employee;

public class Sales extends Employee {
    public Sales(int empid, String ename, double basic) {
        super(empid, ename, basic);
    }

    public double tallowance() {
        return earnings() * 0.05;
    }

    public double totalEarnings() {
        return earnings() + tallowance();
    }

    public void display() {
        System.out.println("The emp id of the employee is " + empid);
        System.out.println("The total earning is " + totalEarnings());
    }
}
