import java.util.Scanner;

class CounterThread extends Thread {

    int start, end;

    CounterThread(String name, int start, int end) {
        super(name);   // setting thread name
        this.start = start;
        this.end = end;
    }

    public void run() {
        try {
            for(int i = start; i <= end; i++) {
                System.out.println(getName() + " : " + i);
                Thread.sleep(5);   // delay of 5 milliseconds
            }
        } 
        catch(InterruptedException e) {
            System.out.println(e);
        }
    }
}

public class CounterExample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Thread Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Start Range: ");
        int start = sc.nextInt();

        System.out.print("Enter End Range: ");
        int end = sc.nextInt();

        CounterThread t1 = new CounterThread(name, start, end);
        t1.start();   // start thread
    }
}