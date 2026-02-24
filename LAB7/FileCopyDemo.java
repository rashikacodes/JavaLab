import java.io.*;
import java.util.Scanner;

class FileCopyDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the source file name:");
        String source = sc.nextLine();

        System.out.println("Enter the destination file name:");
        String destination = sc.nextLine();

            try {
            FileReader fr = new FileReader(source);
            FileWriter fw = new FileWriter(destination);

            int ch;
            while ((ch = fr.read()) != -1) {
                fw.write(ch);
            }

            fr.close();
            fw.close();

            System.out.println("File copied using Character Stream.");

        } catch (IOException e) {
            System.out.println("Error in Character Stream: " + e);
        }

               try {
            FileInputStream fin = new FileInputStream(source);
            FileOutputStream fout = new FileOutputStream("byte_" + destination);

            int b;
            while ((b = fin.read()) != -1) {
                fout.write(b);
            }

            fin.close();
            fout.close();

            System.out.println("File copied using Byte Stream.");

        } catch (IOException e) {
            System.out.println("Error in Byte Stream: " + e);
        }

        sc.close();
    }
}