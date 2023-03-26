package hexlet.code;

import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter."
                + "\n1 - Greet"
                + "\n2 - Even"
                + "\n3 - Calc"
                + "\n4 - GCD"
                + "\n5 - Progression"
                + "\n6 - Prime"
                + "\n0 - Exit");
        System.out.print("Your choice: ");
        String userChoice = scanner.next();

        switch (userChoice) {
            case "1" -> {
                System.out.println("Welcome to the Brain Games!");
                System.out.print("May I have your name? ");
                String userName = scanner.next();
                System.out.println("Hello, " + userName + "!");
            }
            case "2" -> Even.startGameEven();
            case "3" -> Calc.startGameCalc();
            case "4" -> GCD.startGameGCD();
            case "5" -> Progression.startGameProgression();
            case "6" -> Prime.startGamePrime();
            case "0" -> System.out.println("Goodbye!");
            default -> throw new RuntimeException("Unknown input: " + userChoice);
        }

        scanner.close();
    }
}
