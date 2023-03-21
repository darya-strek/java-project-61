package hexlet.code.games;

import hexlet.code.Engine;

public class GCD {
    public static void startGameGCD() {

        int step = 0;
        int maxStep = 3;

        String descriptionOfGame = "Find the greatest common divisor of given numbers.";

        String[] questions = new String[maxStep];
        String[] rightAnswers = new String[maxStep];

        for (var i = step; i < maxStep; i += 1) {

            int firstNumber = (int) (Math.random() * 100 + 1);
            int secondNumber = (int) (Math.random() * 30 + 3);

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
