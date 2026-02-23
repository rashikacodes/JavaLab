package LAB6;

public class Bank {

    static double rate = 5.0;   
    double balance = 10000;     


    static class InterestCalculator {

        static double calculateSI(double p, int t) {
           
            return (p * rate * t) / 100;
        }
    }

    public static void main(String args[]) {

        double si = Bank.InterestCalculator.calculateSI(5000, 2);
        System.out.println("Simple Interest: " + si);
    }
}
 {
    
}
