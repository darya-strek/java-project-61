package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCD {

    private static final int MIN_RANDOM_NUMBER = 1;
    private static final int MAX_RANDOM_NUMBER = 100;

    private static final String DESCRIPTION = "Find the greatest common divisor of given numbers.";

    public static int getGreatestCommonDivisor(int number1, int number2) {
        return (number1 % number2 == 0) ? number2 : getGreatestCommonDivisor(number2, number1 % number2);
    }

    public static void startGameGCD() {

        final int firstStepOfGame = 0;

        String[][] questionsAndAnswers = new String[Engine.MAX_STEP_OF_GAME][2];

        for (var i = firstStepOfGame; i < Engine.MAX_STEP_OF_GAME; i += 1) {

            int firstNumber = Utils.generateRandomNumber(MIN_RANDOM_NUMBER, MAX_RANDOM_NUMBER);
            int secondNumber = Utils.generateRandomNumber(MIN_RANDOM_NUMBER, MAX_RANDOM_NUMBER);

            questionsAndAnswers[i][0] = firstNumber + " " + secondNumber;

            int currentRightAnswer = getGreatestCommonDivisor(firstNumber, secondNumber);
            questionsAndAnswers[i][1] = Integer.toString(currentRightAnswer);
        }

        Engine.game(DESCRIPTION, questionsAndAnswers);

    }
}
