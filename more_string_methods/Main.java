import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int points = 0;
        int wordCount = 1;
        String previousWord;

        System.out.print("Enter your first word:\n[0] ");
        String currentWord = scanner.nextLine();
        previousWord = currentWord;

        while (points < 50) {
            previousWord = currentWord;
            System.out.print("Enter a word:\n[" + wordCount + "] ");
            currentWord = scanner.nextLine();
            if (currentWord.equals("")) {
                System.out.println("You did not enter a word");
                continue;
            }
            wordCount++;

            int difference = currentWord.compareTo(previousWord);
            if (difference > 0) {
                points += 2;
                System.out.println("Current word is alphabetically after previous word (+2 pts) <" + points + " pts>");
            } else if (difference < 0) {
                points -= 5;
                System.out.println("Current word is alphabetically before previous word (-5 pts) <" + points + " pts>");
            } else {
                points -= 10;
                System.out.println("Current word is the same as the previous word (-10 pts) <" + points + " pts>");
            }
            if (previousWord.length() >= 2 && currentWord.length() >= 2) {
                String prevWordLast2 = previousWord.substring(previousWord.length() - 2);
                String currentWordFirst2 = currentWord.substring(0, 2);
                if (prevWordLast2.equals(currentWordFirst2)) {
                    points += 5;
                    System.out.println("Last 2 letters of previous word match first 2 letters of current word (+5 pts) <" + points + " pts>");
                }
            }
            if (currentWord.indexOf(previousWord.substring(0, 1)) != -1) {
                points += 3;
                System.out.println("First letter of previous word is found in current word (+3 pts) <" + points + " pts>");
            }
            if (currentWord.length() == previousWord.length()) {
                points += 2;
                System.out.println("Previous word length is the same as current word length (+2 pts) <" + points + " pts>");
            }
        }

        System.out.println("\nYou win!");
        System.out.println("Final point count: " + points);
        System.out.println("Number of words used: " + wordCount);
    }
}