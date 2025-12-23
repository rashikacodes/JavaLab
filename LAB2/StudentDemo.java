import java.util.Scanner;

class Student {
    int roll;
    String name;
    double cgpa;
    void read(Scanner sc) {
        System.out.print("Enter roll number: ");
        roll = sc.nextInt();
        sc.nextLine();   // consume newline
        System.out.print("Enter name: ");
        name = sc.nextLine();
        System.out.print("Enter CGPA: ");
        cgpa = sc.nextDouble();
    }   
    void display() {
        System.out.println("Roll: " + roll);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + cgpa);
        System.out.println("-------------------");
    }
}
class StudentDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        Student[] s = new Student[n];
               for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of student " + (i + 1));
            s[i] = new Student();
            s[i].read(sc);
        }
        System.out.println("\nStudent Details:");
        for (int i = 0; i < n; i++) {
            s[i].display();
        }

        // Find student with lowest CGPA
        double minCgpa = s[0].cgpa;
        String minName = s[0].name;

        for (int i = 1; i < n; i++) {
            if (s[i].cgpa < minCgpa) {
                minCgpa = s[i].cgpa;
                minName = s[i].name;
            }
        }

        System.out.println("Student with lowest CGPA: " + minName);
        System.out.println("Lowest CGPA: " + minCgpa);

        sc.close();
    }
}
