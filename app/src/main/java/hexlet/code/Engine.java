package hexlet.code;

import java.util.Scanner;

public class Engine {

    public static void game(String description, String[][] questionsAndAnswers) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println(description);

        for (String[] questionAnswer : questionsAndAnswers) {

            System.out.println("\nQuestion: " + questionAnswer[0]);
            System.out.print("Your answer: ");
            String userAnswer = (scanner.next()).toLowerCase();

            if (userAnswer.equals(questionAnswer[1])) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '"
                        + questionAnswer[1] + "'.");
                System.out.println("Let's try again, " + userName + "!");
                scanner.close();
                return;
            }
        }

        System.out.println("Congratulations, " + userName + "!");
    }

}

