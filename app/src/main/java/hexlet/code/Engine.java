package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static void game(String description, String[] questions, String[] rightAnswers) {

        int stepOfGame = 0;
        int maxStepOfGame = 3;

        Cli.greetings();
        System.out.println(description);

        while (stepOfGame < maxStepOfGame) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("\nQuestion: " + questions[stepOfGame]);
            System.out.print("Your answer: ");
            String userAnswer = (scanner.next()).toLowerCase();

            if (userAnswer.equals(rightAnswers[stepOfGame])) {
                System.out.println("Correct!");
                stepOfGame += 1;
            } else {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '"
                        + rightAnswers[stepOfGame] + "'.");
                System.out.println("Let's try again, " + Cli.getUserName() + "!");
                scanner.close();
                break;
            }
        }

        if (stepOfGame == 3) {
            System.out.println("Congratulations, " + Cli.getUserName() + "!");
        }

    }
}
