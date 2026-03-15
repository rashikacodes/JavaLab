import java.io.*;
public class Class
{
    public static void main(String[] args) throws IOException {
        File inputFile = new File("source.txt");
        File outputFile = new File("target.txt");
        FileReader in = new FileReader(inputFile);
        FileWriter out = new FileWriter(outputFile);
        int c;
        while ((c = in.read()) != -1) {
            out.write(c);
        }
        System.out.println("File Copied Successfully");
        in.close();
        out.close();
     }
}