import java.util.Scanner;

class EvenOdd {
    public static void main(String[] args) {

        int evenCount = 0;
        int oddCount = 0;

        if (args.length != 10) {
            System.out.println("Please enter exactly 10 numbers.");
            return;
        }

       
        for (int i = 0; i < args.length; i++) {
            int num = Integer.parseInt(args[i]);

            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Even numbers count: " + evenCount);
        System.out.println("Odd numbers count: " + oddCount);
    }
}

		