package hexlet.code.games;

import hexlet.code.Engine;

public class Calc {
    public static void startGameCalc() {

        int stepOfGame = Engine.FIRST_STEP_OF_GAME;
        int maxStepOfGame = Engine.MAX_STEP_OF_GAME;

        String descriptionOfGame = "What is the result of the expression?";

        String[] questions = new String[maxStepOfGame];
        String[] rightAnswers = new String[maxStepOfGame];

        for (var i = stepOfGame; i < maxStepOfGame; i += 1) {

            int firstNumber = Engine.getRangomNumber(Engine.MAX_RANDOM_NUMBER, Engine.MIN_RANDOM_NUMBER);
            int secondNumber = Engine.getRangomNumber(Engine.MAX_RANDOM_NUMBER, Engine.MIN_RANDOM_NUMBER);
            String operator = getRandomOperator();

            questions[i] = firstNumber + " " + operator + " " + secondNumber;

            int operationResult = switch (operator) {
                case "+" -> firstNumber + secondNumber;
                case "-" -> firstNumber - secondNumber;
                case "*" -> firstNumber * secondNumber;
                default -> Integer.parseInt(null);
            };

            rightAnswers[i] = Integer.toString(operationResult);
        }

        Engine.game(descriptionOfGame, questions, rightAnswers);
    }

    public static String getRandomOperator() {
        String[] operators = {"+", "-", "*"};
        int i = (int) (Math.random() * 3);
        return operators[i];
    }
}
