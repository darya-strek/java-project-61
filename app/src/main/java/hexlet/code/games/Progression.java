package hexlet.code.games;

import hexlet.code.Engine;

public class Progression {
    public static void startGameProgression() {

        int stepOfGame = 0;
        int maxStepOfGame = 3;
        int maxLengthOfArray = 8;
        int maxFirstNumber = 15;
        int maxStepOfProgression = 12;

        String descriptionOfGame = "What number is missing in the progression?";

        String[] questions = new String[maxStepOfGame];
        String[] rightAnswers = new String[maxStepOfGame];

        for (var i = stepOfGame; i < maxStepOfGame; i += 1) {

            int lengthOfArray = (int) (Math.random() * maxLengthOfArray + 5);
            String[] arrayOfNumbers = new String[lengthOfArray];

            int firstNumber = (int) (Math.random() * maxFirstNumber + 1);
            int stepOfProgression = (int) (Math.random() * maxStepOfProgression + 1);
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
