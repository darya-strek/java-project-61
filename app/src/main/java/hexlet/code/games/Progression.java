package hexlet.code.games;

import hexlet.code.Engine;

public class Progression {
    public static void startGameProgression() {

        int stepOfGame = Engine.FIRST_STEP_OF_GAME;
        int maxStepOfGame = Engine.MAX_STEP_OF_GAME;
        final int minLengthOfArray = 5;
        final int maxLengthOfArray = 8;
        final int maxFirstNumber = 15;
        final int maxStepOfProgression = 12;

        String descriptionOfGame = "What number is missing in the progression?";

        String[] questions = new String[maxStepOfGame];
        String[] rightAnswers = new String[maxStepOfGame];

        for (var i = stepOfGame; i < maxStepOfGame; i += 1) {

            int lengthOfArray = Engine.getRangomNumber(maxLengthOfArray, minLengthOfArray);
            String[] arrayOfNumbers = new String[lengthOfArray];

            int firstNumber = Engine.getRangomNumber(maxFirstNumber, Engine.MIN_RANDOM_NUMBER);
            int stepOfProgression = Engine.getRangomNumber(maxStepOfProgression, Engine.MIN_RANDOM_NUMBER);
            int currentNumber = firstNumber;

            for (var n = 0; n < lengthOfArray; n += 1) {
                arrayOfNumbers[n] = String.valueOf(currentNumber);
                currentNumber += stepOfProgression;
            }

            int hiddenArrayNumber = (int) (Math.random() * lengthOfArray);
            rightAnswers[i] = arrayOfNumbers[hiddenArrayNumber];
            arrayOfNumbers[hiddenArrayNumber] = "..";
            questions[i] = String.join(" ", arrayOfNumbers);

        }

        Engine.game(descriptionOfGame, questions, rightAnswers);
    }
}
