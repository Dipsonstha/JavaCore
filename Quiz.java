import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        // Scanner class to take user input
        Scanner sc = new Scanner(System.in);

        // Inititalize Score
        int score = 0;
        // Show current score point
        System.out.println("Your current score is " + score);

        // First question
        System.out.println("1. Which country held the 2016 Summer Olympics?");
        System.out.println("\ta) China\n" + //
                "    \tb) Ireland\n" + //
                "    \tc) Brazil\n" + //
                "    \td) Italy\n" + //
                "");
        System.out.println("Enter your answer: ");
        char first = sc.next().charAt(0);
        if (first == 'c') {
            score += 5;
        }
        // Next line throw away
        System.out.println("Your current score is " + score);

        System.out.println();

        // Second question
        System.out.println("2. Which planet is the hottest?");
        System.out.println("\ta) Venus\n" + //
                "    \tb) Saturn\n" + //
                "    \tc) Mercury\n" + //
                "    \td) Mars\n" + //
                "");
        System.out.println("Enter your answer: ");
        char second = sc.next().charAt(0);
        if (second == 'a') {
            score += 5;

        }
        System.out.println("Your current score is " + score);
        System.out.println();

        // Third question

        System.out.println("What is the rarest blood type?");
        System.out.println("\ta) O\n" + //
                "    \tb) A\n" + //
                "    \tc) B\n" + //
                "    \td) AB-Negative\n" + //
                "");
        System.out.println("Enter your answer: ");
        char third = sc.next().charAt(0);
        if (third == 'd') {
            score += 5;
        }
        System.out.println("Your current score is " + score);
        System.out.println();
        // Fourth question

        System.out.println("Which one of these characters is friends with Harry Potter?");
        System.out.println("\ta) Ron Weasley\n" + //
                "    \tb) Hermione Granger\n" + //
                "    \tc) Draco Malfoy\n" + //
                "");
        System.out.println("Enter your answer: ");
        char fourth = sc.next().charAt(0);
        if (fourth == 'a') {
            score += 5;
        }
        System.out.println("Your current score is " + score);
        System.out.println();

        // Return Final score with some quotes
        System.out.println("//////////////////////////////////////////////");
        System.out.println("Your final score is: " + score + "/20");
        if (score >= 15) {
            System.out.println("Wow,you know your stuff!");
        } else if (score < 15 && score > 5) {
            System.out.println("Not bad!");

        } else {
            System.out.println("better luck next time");
        }
    }
}
