package hexlet.code;

import java.util.Scanner;

public class Even {
    public static void startGameEven() {

        Cli.greetings();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'");

        int step = 0;
        int maxStep = 3;

        while (step < maxStep) {

            int number1 = (int) (Math.random() * 100);
            String rightAnswer = (number1 % 2 == 0) ? "yes" : "no";

            Scanner scanner = new Scanner(System.in);
            System.out.println("\nQuestion: " + number1);
            System.out.print("Your answer: ");
            String userAnswer = scanner.next();

            if (userAnswer.equals(rightAnswer)) {
                System.out.println("Correct!");
                step += 1;
            } else {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '"
                        + rightAnswer + "'.");
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
