import java.util.Scanner;

public class ChatBot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Hello. What is your name?");
        String name = input.nextLine();
        System.out.println("\nHi " + name + "! I'm Javabot. Where are you from?");
        String address = input.nextLine();
        System.out.println("\nI hear it's beautiful at " + address + "! I'm from a place called Oracle");
        System.out.println("\nHow old are you?");
        int age = input.nextInt();
        System.out.println("\nSo you're " + age + ", cool! I'm 400 years old.");
        System.out.println("\nThis means I'm 8 times older than you.");
        System.out.println("\nEnough about me. What's your favourite language? (just don't say python)");
        input.nextLine();
        String language = input.nextLine();
        System.out.println();
        System.out.println(
                language + ", that's great! Nice chatting with you " + name + ". I have to log off now. see ya!");
    }
}
