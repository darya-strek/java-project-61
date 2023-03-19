package hexlet.code;

import java.util.Scanner;
public class Cli {
    private static String userName;
    public static void greetings() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nWelcome to the Brain Games!");
        System.out.print("May I have your name? ");
        userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
    }
    public static String getUserName() {
        return userName;
    }
}
