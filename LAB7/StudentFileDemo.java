import java.io.*;
import java.util.Scanner;

class StudentFileDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.println("Enter student Roll No:");
            int roll = sc.nextInt();
            sc.nextLine();  

            System.out.println("Enter student Name:");
            String name = sc.nextLine();

            System.out.println("Enter Subject:");
            String subject = sc.nextLine();

            System.out.println("Enter Marks:");
            int marks = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter the name of existing file:");
            String filename = sc.nextLine();

            FileWriter fw = new FileWriter(filename, true);
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write("Roll No: " + roll);
            bw.newLine();
            bw.write("Name: " + name);
            bw.newLine();
            bw.write("Subject: " + subject);
            bw.newLine();
            bw.write("Marks: " + marks);
            bw.newLine();
            bw.close();
            System.out.println("\nStudent details successfully written to file.\n");

            // Reading from file
            FileReader fr = new FileReader(filename);
            BufferedReader br = new BufferedReader(fr);

            System.out.println("----- File Contents -----");

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }

        sc.close();
    }
}