import java.util.Scanner;

public class Function01 {
    public static void tipTheWaiter(double bill) {

        double tip = (bill * 15 / 100);

        System.out.println("The tip of 15% for the bill " + bill + " is " + tip);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your bill amount:");
        int bill = input.nextInt();
        tipTheWaiter(bill);

    }
}
