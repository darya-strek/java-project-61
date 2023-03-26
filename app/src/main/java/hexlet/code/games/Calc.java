package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {

    private static final int MIN_RANDOM_NUMBER = 1;
    private static final int MAX_RANDOM_NUMBER = 100;

    private static final String DESCRIPTION = "What is the result of the expression?";

    private static String getRandomOperator() {
        String[] operators = {"+", "-", "*"};
        int i = (int) (Math.random() * operators.length);
        return operators[i];
    }

    public static void startGameCalc() {

        final int firstStepOfGame = 0;
        final int maxStepOfGame = 3;

        String[][] questionsAndAnswers = new String[maxStepOfGame][2];

        for (var i = firstStepOfGame; i < maxStepOfGame; i += 1) {

            int firstNumber = Utils.generateRangomNumber(MAX_RANDOM_NUMBER, MIN_RANDOM_NUMBER);
            int secondNumber = Utils.generateRangomNumber(MAX_RANDOM_NUMBER, MIN_RANDOM_NUMBER);
            String operator = getRandomOperator();

            questionsAndAnswers[i][0] = firstNumber + " " + operator + " " + secondNumber;

            int operationResult = switch (operator) {
                case "+" -> firstNumber + secondNumber;
                case "-" -> firstNumber - secondNumber;
                case "*" -> firstNumber * secondNumber;
                default -> throw new RuntimeException("Unknown operator");
            };

            questionsAndAnswers[i][1] = Integer.toString(operationResult);
        }

        Engine.game(DESCRIPTION, questionsAndAnswers);
    }

}
