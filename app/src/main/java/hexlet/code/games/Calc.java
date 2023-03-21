package hexlet.code.games;

import hexlet.code.Engine;

public class Calc {
    public static void startGameCalc() {

        int step = 0;
        int maxStep = 3;

        String descriptionOfGame = "What is the result of the expression?";

        String[] questions = new String[maxStep];
        String[] rightAnswers = new String[maxStep];

        for (var i = step; i < maxStep; i += 1) {

            int firstNumber = (int) (Math.random() * 30 + 3);
            int secondNumber = (int) (Math.random() * 30 + 3);
            String operator = getRandomOperator();

            questions[i] = firstNumber + " " + operator + " " + secondNumber;

            int operationResult;
            switch (operator) {
                case "+":
                    operationResult = firstNumber + secondNumber;
                    break;
                case "-":
                    operationResult = firstNumber - secondNumber;
                    break;
                case "*":
                    operationResult = firstNumber * secondNumber;
                    break;
                default:
                    operationResult = Integer.parseInt(null);
            }

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
