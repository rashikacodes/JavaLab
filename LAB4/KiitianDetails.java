import java.util.Scanner;

abstract class Student {
    int roll;
    long reg_no;

    void getinput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter roll:");
        roll = sc.nextInt();
        System.out.println("Enter reg no:");
        reg_no = sc.nextLong();
        sc.close(); 
    }

    abstract void course();
}

class Kiitian extends Student {

    void course() {
        System.out.println("Course - B.Tech. (Computer Science & Engg)");
    }

    void display() {
        System.out.println("Rollno - " + roll);
        System.out.println("Registration no - " + reg_no);
        course();
    }
}

public class KiitianDetails {
    public static void main(String[] args) {
        Kiitian k = new Kiitian();
        k.getinput();
        k.display();
    }
}
