package hexlet.code.games;

import hexlet.code.Engine;

public class GCD {
    public static void startGameGCD() {

        int stepOfGame = 0;
        int maxStepOfGame = 3;
        int maxRandomNumber = 100;

        String descriptionOfGame = "Find the greatest common divisor of given numbers.";

        String[] questions = new String[maxStepOfGame];
        String[] rightAnswers = new String[maxStepOfGame];

        for (var i = stepOfGame; i < maxStepOfGame; i += 1) {

            int firstNumber = (int) (Math.random() * maxRandomNumber + 1);
            int secondNumber = (int) (Math.random() * maxRandomNumber + 1);

            questions[i] = firstNumber + " " + secondNumber;

            int previewRightAnswer = getGreatestCommonDivisor(firstNumber, secondNumber);
            rightAnswers[i] = Integer.toString(previewRightAnswer);
        }

        Engine.game(descriptionOfGame, questions, rightAnswers);
    }

    public static int getGreatestCommonDivisor(int number1, int number2) {
        int gcdNumber = (number1 % number2 == 0) ? number2 : getGreatestCommonDivisor(number2, number1 % number2);
        return gcdNumber;
    }
}
