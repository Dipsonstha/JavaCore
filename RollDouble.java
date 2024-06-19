public class RollDouble {

    public static int Random() {
        int randomNumber = (int) (Math.random() * 6 + 1);
        return randomNumber;
    }

    public static void main(String[] args) {

        int dice1, dice2;
        do {
            dice1 = Random();
            dice2 = Random();
            System.out.println("Dice 1: " + dice1);
            System.out.println("Dice 2: " + dice2);
            System.out.println();

        } while (dice1 != dice2);

        if (dice1 == dice2) {

            System.out.println("you rolled doubles!");
        }

    }
}
