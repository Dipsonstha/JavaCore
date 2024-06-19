import java.util.Scanner;

public class RockPaper {

    public static String computerChoice() {

        int random = (int) (Math.random() * 2);
        if (random == 0) {

            return "rock";

        } else if (random == 1) {
            return "paper";

        } else {
            return "sissors";

        }
    }

    public static String Result(String yourChoice, String computerChoice) {
        if (yourChoice.equals("rock") && computerChoice.equals("scissors") ||
                yourChoice.equals("paper") && computerChoice.equals("rock") ||
                yourChoice.equals("scissors") && computerChoice.equals("paper")) {
            return "You win!";
        } else if (yourChoice.equals("scissors") && computerChoice.equals("rock") ||
                yourChoice.equals("rock") && computerChoice.equals("paper") ||
                yourChoice.equals("paper") && computerChoice.equals("scissors")) {
            return "You lose";
        } else if (yourChoice.equals(computerChoice)) {
            return "It's a tie.";
        } else {
            return "Invalid Choice";
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println(">>>Lets play Rock, Paper or Sissors.");
        System.out.println(">>>When i say 'shoot', Choose: rock, paper , scissors.");
        System.out.println(">>>");
        System.out.println(">>>Are you Ready ? Write 'yes' if you are");

        String userStart = input.nextLine();
        if (userStart.equals("yes")) {
            System.out.println("-- Great!");
            System.out.println("-- Rock - Paper - Scissors - Shoot!");
            String yourChoice = input.nextLine();

            System.out.println();
            String computer = computerChoice();
            System.out.println("you choose:  " + yourChoice);
            System.out.println("Computer choose:    " + computer);

            System.out.println();
            String result = Result(yourChoice, computer);
            System.out.println(result);

        } else {
            System.out.println("--Damn, some other time...!");
        }
    }
}
