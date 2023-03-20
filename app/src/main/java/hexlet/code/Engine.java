package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static void game(String description, String[] questions, String[] rightAnswers) {

        int step = 0;
        int maxStep = 3;

        Cli.greetings();
        System.out.println(description);

        while (step < maxStep) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("\nQuestion: " + questions[step]);
            System.out.print("Your answer: ");
            String userAnswer = scanner.next();

            if (userAnswer.equals(rightAnswers[step])) {
                System.out.println("Correct!");
                step += 1;
            } else {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '"
                        + rightAnswers[step] + "'.");
                System.out.println("Let's try again, " + Cli.getUserName() + "!");
                scanner.close();
                break;
            }
        }

        if (step == 3) {
            System.out.println("Congratulations, " + Cli.getUserName() + "!");
        }

    }
}
