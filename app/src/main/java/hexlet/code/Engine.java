package hexlet.code;

import java.util.Scanner;

public class Engine {

    public static final int FIRST_STEP_OF_GAME = 0;
    public static final int MAX_STEP_OF_GAME = 3;
    public static final int MIN_RANDOM_NUMBER = 1;
    public static final int MAX_RANDOM_NUMBER = 100;

    public static void game(String description, String[] questions, String[] rightAnswers) {

        int stepOfGame = FIRST_STEP_OF_GAME;

        Cli.greetings();
        System.out.println(description);

        while (stepOfGame < MAX_STEP_OF_GAME) {
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

        if (stepOfGame == MAX_STEP_OF_GAME) {
            System.out.println("Congratulations, " + Cli.getUserName() + "!");
        }

    }

    public static int getRangomNumber(int maxNumber, int minNumber) {
        return (int) (Math.random() * maxNumber + minNumber);
    }
}
