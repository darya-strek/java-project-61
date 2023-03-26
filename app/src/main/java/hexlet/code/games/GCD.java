package hexlet.code.games;

import hexlet.code.Engine;

public class GCD {
    public static void startGameGCD() {

        int stepOfGame = Engine.FIRST_STEP_OF_GAME;
        int maxStepOfGame = Engine.MAX_STEP_OF_GAME;

        String descriptionOfGame = "Find the greatest common divisor of given numbers.";

        String[] questions = new String[maxStepOfGame];
        String[] rightAnswers = new String[maxStepOfGame];

        for (var i = stepOfGame; i < maxStepOfGame; i += 1) {

            int firstNumber = Engine.getRangomNumber(Engine.MAX_RANDOM_NUMBER, Engine.MIN_RANDOM_NUMBER);
            int secondNumber = Engine.getRangomNumber(Engine.MAX_RANDOM_NUMBER, Engine.MIN_RANDOM_NUMBER);

            questions[i] = firstNumber + " " + secondNumber;

            int currentRightAnswer = getGreatestCommonDivisor(firstNumber, secondNumber);
            rightAnswers[i] = Integer.toString(currentRightAnswer);
        }

        Engine.game(descriptionOfGame, questions, rightAnswers);
    }

    public static int getGreatestCommonDivisor(int number1, int number2) {
        return (number1 % number2 == 0) ? number2 : getGreatestCommonDivisor(number2, number1 % number2);
    }
}
