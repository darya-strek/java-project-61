package hexlet.code.games;

import hexlet.code.Engine;

public class Even {
    public static void startGameEven() {

        int stepOfGame = 0;
        int maxStepOfGame = 3;
        int maxRandomNumber = 100;

        String descriptionOfGame = "Answer 'yes' if the number is even, otherwise answer 'no'.";

        String[] questions = new String[maxStepOfGame];
        String[] rightAnswers = new String[maxStepOfGame];

        for (var i = stepOfGame; i < maxStepOfGame; i += 1) {
            int currentRandomNumber = (int) (Math.random() * maxRandomNumber + 1);
            questions[i] = Integer.toString(currentRandomNumber);
            rightAnswers[i] = (currentRandomNumber % 2 == 0) ? "yes" : "no";
        }

        Engine.game(descriptionOfGame, questions, rightAnswers);
    }
}
