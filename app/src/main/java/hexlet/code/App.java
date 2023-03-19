package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter."
                + "\n1 - Greet"
                + "\n2 - Even"
                + "\n0 - Exit");
        System.out.print("Your choice: ");
        String userAnswer = scanner.next();

        switch (userAnswer) {
            case "1":
                Cli.greetings();
                break;
            case "2":
                Even.startGameEven();
            default:
                scanner.close();

        }

        scanner.close();

    }
}
