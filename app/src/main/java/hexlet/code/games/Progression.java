package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {

    private static final int MIN_RANDOM_NUMBER = 1;
    private static final int MIN_LENGTH_OF_ARRAY = 5;
    private static final int MAX_LENGTH_OF_ARRAY = 12;
    private static final int MAX_FIRST_NUMBER = 5;
    private static final int MAX_STEP_OF_PROGRESSION = 12;

    private static final String DESCRIPTION = "What number is missing in the progression?";

    private static String[] generateProgressionArray(int firstNumber, int step, int length) {
        String[] array = new String[length];
        int currentNumber = firstNumber;
        for (var n = 0; n < length; n += 1) {
            array[n] = String.valueOf(currentNumber);
            currentNumber += step;
        }
        return array;
    }

    public static void startGameProgression() {

        final int stepOfGame = 0;
        final int maxStepOfGame = 3;

        String[][] questionsAndAnswers = new String[maxStepOfGame][2];

        for (var i = stepOfGame; i < maxStepOfGame; i += 1) {

            int firstNumber = Utils.generateRangomNumber(MAX_FIRST_NUMBER, MIN_RANDOM_NUMBER);
            int stepOfProgression = Utils.generateRangomNumber(MAX_STEP_OF_PROGRESSION, MIN_RANDOM_NUMBER);
            int lengthOfArray = Utils.generateRangomNumber(MAX_LENGTH_OF_ARRAY, MIN_LENGTH_OF_ARRAY);

            String[] arrayOfNumbers = generateProgressionArray(firstNumber, stepOfProgression, lengthOfArray);

            int hiddenArrayNumber = Utils.generateRangomNumber(lengthOfArray - 1, 0);

            questionsAndAnswers[i][1] = arrayOfNumbers[hiddenArrayNumber];
            arrayOfNumbers[hiddenArrayNumber] = "..";
            questionsAndAnswers[i][0] = String.join(" ", arrayOfNumbers);
        }

        Engine.game(DESCRIPTION, questionsAndAnswers);

    }
}
