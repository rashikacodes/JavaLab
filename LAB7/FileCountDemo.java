import java.io.*;
import java.util.Scanner;

class FileCountDemo {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter name of the file:");
        String filename = sc.nextLine();

        int characters = 0;
        int words = 0;
        int lines = 0;

        try {

            BufferedReader br = new BufferedReader(new FileReader(filename));
            String line;

            while ((line = br.readLine()) != null) {

                lines++;   // Count lines

                // Count characters (including spaces)
                characters += line.length();

                // Split line into words
                String wordsArray[] = line.split("\\s+");

                if (!line.trim().isEmpty()) {
                    words += wordsArray.length;
                }
            }

            br.close();

            System.out.println("No. of characters - " + characters);
            System.out.println("No. of lines - " + lines);
            System.out.println("No. of words - " + words);

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }

        sc.close();
    }
}