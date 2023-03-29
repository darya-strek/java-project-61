package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {

    private static final int MIN_RANDOM_NUMBER = 1;
    private static final int MAX_RANDOM_NUMBER = 100;

    private static final String DESCRIPTION = "What is the result of the expression?";

    private static final char[] OPERATORS = {'+', '-', '*'};

    public static void startGameCalc() {

        final int firstStepOfGame = 0;

        String[][] questionsAndAnswers = new String[Engine.MAX_STEP_OF_GAME][2];

        for (var i = firstStepOfGame; i < Engine.MAX_STEP_OF_GAME; i += 1) {

            int firstNumber = Utils.generateRandomNumber(MIN_RANDOM_NUMBER, MAX_RANDOM_NUMBER);
            int secondNumber = Utils.generateRandomNumber(MIN_RANDOM_NUMBER, MAX_RANDOM_NUMBER);
            int indexOperator = Utils.generateRandomNumber(0, OPERATORS.length - 1);
            char operator = OPERATORS[indexOperator];

            questionsAndAnswers[i][0] = firstNumber + " " + operator + " " + secondNumber;

            int operationResult = switch (operator) {
                case '+' -> firstNumber + secondNumber;
                case '-' -> firstNumber - secondNumber;
                case '*' -> firstNumber * secondNumber;
                default -> throw new RuntimeException("Unknown operator: " + operator);
            };

            questionsAndAnswers[i][1] = Integer.toString(operationResult);
        }

        Engine.game(DESCRIPTION, questionsAndAnswers);

    }
}
