import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your Symbol number: ");
        int symbolNumber = sc.nextInt();
        // Next line throw away
        // System.out.println();
        sc.nextLine();
        System.out.println("Enter you name: ");
        String name = sc.next();
        System.out.println(symbolNumber);
        System.out.println(name);
    }
}