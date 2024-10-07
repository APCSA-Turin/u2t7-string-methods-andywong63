import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string:\n> ");
        String str1 = scanner.nextLine();
        System.out.print("Enter the second string:\n> ");
        String str2 = scanner.nextLine();
        scanner.close();
        System.out.println();

        int str1Length = str1.length();
        int str2Length = str2.length();

        if (str1Length > str2Length) {
            System.out.println("\"" + str1 + "\" is longer than \"" + str2 + "\"");
        } else if (str1Length < str2Length) {
            System.out.println("\"" + str2 + "\" is longer than \"" + str1 + "\"");
        } else {
            System.out.println("\"" + str1 + "\" has the same length as \"" + str2 + "\"");
        }
        System.out.println();
        
        System.out.println("String 1:");
        System.out.println("First half: " + str1.substring(0, str1Length / 2));
        System.out.println("Second half: " + str1.substring(str1Length / 2));
        System.out.println();
        System.out.println("String 2:");
        System.out.println("First half: " + str2.substring(0, str2Length / 2));
        System.out.println("Second half: " + str2.substring(str2Length / 2));
        System.out.println();

        int str2Index = str1.indexOf(str2);
        if (str2Index == -1) {
            System.out.println("\"" + str2 + "\" is not found in \"" + str1 + "\"");
        } else {
            System.out.println("\"" + str2 + "\" is found in \"" + str1 + "\" at index " + str2Index);
        }
    }
}