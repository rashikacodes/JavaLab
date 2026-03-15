class Display {

    synchronized void printNumbers(String threadName) {
        for(int i = 1; i <= 5; i++) {
            System.out.println(threadName + " : " + i);
            try {
                Thread.sleep(500);
            }
            catch(Exception e) {
                System.out.println(e);
            }
        }
    }
}

class MyThread1 extends Thread {
    Display d;

    MyThread1(Display d) {
        this.d = d;
    }

    public void run() {
        d.printNumbers("Thread 1");
    }
}

class MyThread2 extends Thread {
    Display d;

    MyThread2(Display d) {
        this.d = d;
    }

    public void run() {
        d.printNumbers("Thread 2");
    }
}

public class SyncTest {
    public static void main(String args[]) {

        Display obj = new Display();

        MyThread1 t1 = new MyThread1(obj);
        MyThread2 t2 = new MyThread2(obj);

        t1.start();
        t2.start();
    }
}