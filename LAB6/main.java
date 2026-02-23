// 1.Define two packages as – General and Marketing. In General package define a class ‘employee’  with data members as empid(protected), ename(private) and a public method as earnings() which calculate total earnings as 	earnings         basic + DA (80% of basic) + HRA (15% of basic) In Marketing package define a class ‘sales’ which is extending from ‘employee’ class and has a method  tallowance() which calculates Travelling Allowance as 5% of total earning. Write the programs to find out total earning of a sales person for the given basic salary amount and print along with the emp id.
import Marketing.sales;
public class main { 
    public static void main(String[] args) {
        int empid = 101;
        String ename = "John Doe";
        double basic = 50000;

        sales salesperson = new sales(empid, ename, basic);
        double totalEarnings = salesperson.earnings() + salesperson.tallowance();

        System.out.println("Employee ID: " + salesperson.empid);
        System.out.println("Total Earnings: " + totalEarnings);
    }
}