import java.util.Scanner;

class StringOperations {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String : ");
        String s1 = sc.nextLine();
        System.out.println("The string after changing the case is " + s1.toUpperCase());

        String rev = "";
        for (int i = s1.length() - 1; i >= 0; i--) {
            rev = rev + s1.charAt(i);
        }
        System.out.println("The string after reversing is " + rev);

        System.out.print("\nEnter the second string for comparision : ");
        String s2 = sc.nextLine();
        int diff = Math.abs(s1.charAt(0) - s2.charAt(0));
        System.out.println("The difference between ASCII value is " + diff);

        System.out.print("\nEnter the string to be inserted into first string : ");
        String s3 = sc.nextLine();
        System.out.println("The string after insertion is : " + s1 + " " + s3);

        System.out.print("\nEnter a String : ");
        String s4 = sc.nextLine();
        System.out.println("Uppercase: " + s4.toUpperCase());
        System.out.println("Lowercase: " + s4.toLowerCase());

        System.out.print("\nEnter a String : ");
        String s5 = sc.nextLine();
        System.out.print("Enter a character : ");
        char ch = sc.next().charAt(0);

        int pos = s5.indexOf(ch);
        if (pos != -1)
            System.out.println("Position of entered character: " + pos);
        else
            System.out.println("Entered character is not present");

        sc.nextLine(); // clear buffer

        System.out.print("\nEnter a String : ");
        String s6 = sc.nextLine();
        String rev2 = "";
        for (int i = s6.length() - 1; i >= 0; i--) {
            rev2 += s6.charAt(i);
        }

        if (s6.equalsIgnoreCase(rev2))
            System.out.println("Entered string is palindrome");
        else
            System.out.println("Entered string is not a palindrome");

        System.out.print("\nEnter a String : ");
        String s7 = sc.nextLine();

        int words = s7.trim().split("\\s+").length;
        int vowels = 0, consonants = 0;

        for (int i = 0; i < s7.length(); i++) {
            char c = Character.toLowerCase(s7.charAt(i));
            if (c >= 'a' && c <= 'z') {
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
                    vowels++;
                else
                    consonants++;
            }
        }

        System.out.println("No. of words: " + words);
        System.out.println("No. of vowels: " + vowels);
        System.out.println("No. of consonants: " + consonants);

        sc.close();
    }
}