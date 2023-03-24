package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
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
                + "\n0 - Exit");
        System.out.print("Your choice: ");
        String userChoice = scanner.next();

        switch (userChoice) {
            case "1":
                Cli.greetings();
                break;
            case "2":
                Even.startGameEven();
                break;
            case "3":
                Calc.startGameCalc();
                break;
            case "4":
                GCD.startGameGCD();
                break;
            case "5":
                Progression.startGameProgression();
                break;
            default:
                scanner.close();
        }

        scanner.close();

    }
}
