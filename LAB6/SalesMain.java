

import java.util.Scanner;

// import the Sales class from the Marketing subpackage
import Marketing.Sales;

public class SalesMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter employee id: ");
        int empid = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter employee name: ");
        String ename = sc.nextLine();

        System.out.print("Enter basic salary: ");
        double basic = sc.nextDouble();

        Sales sales = new Sales(empid, ename, basic);
        double total = sales.totalEarnings();

        System.out.println("Employee Id: " + sales.getEmpid());
        System.out.println("Total Earnings: " + total);
        sales.display();

        sc.close();
    }
}
