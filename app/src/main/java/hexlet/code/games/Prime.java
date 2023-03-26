package hexlet.code.games;

import hexlet.code.Engine;

public class Prime {
    public static void startGamePrime() {

        int stepOfGame = Engine.FIRST_STEP_OF_GAME;
        int maxStepOfGame = Engine.MAX_STEP_OF_GAME;

        String descriptionOfGame = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

        String[] questions = new String[maxStepOfGame];
        String[] rightAnswers = new String[maxStepOfGame];

        for (var i = stepOfGame; i < maxStepOfGame; i += 1) {
            int currentRandomNumber = Engine.getRangomNumber(Engine.MAX_RANDOM_NUMBER, Engine.MIN_RANDOM_NUMBER);
            questions[i] = Integer.toString(currentRandomNumber);
            rightAnswers[i] = isPrime(currentRandomNumber) ? "yes" : "no";
        }

        Engine.game(descriptionOfGame, questions, rightAnswers);
    }

    public static boolean isPrime(int number) {
        for (var n = 2; n <= (number / 2); n += 1) {
            if (number % n == 0) {
                return false;
            }
        }
        return true;
    }
}
