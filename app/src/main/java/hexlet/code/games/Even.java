package hexlet.code.games;

import hexlet.code.Engine;

public class Even {
    public static void startGameEven() {

        int stepOfGame = Engine.FIRST_STEP_OF_GAME;
        int maxStepOfGame = Engine.MAX_STEP_OF_GAME;

        String descriptionOfGame = "Answer 'yes' if the number is even, otherwise answer 'no'.";

        String[] questions = new String[maxStepOfGame];
        String[] rightAnswers = new String[maxStepOfGame];

        for (var i = stepOfGame; i < maxStepOfGame; i += 1) {
            int currentRandomNumber = Engine.getRangomNumber(Engine.MAX_RANDOM_NUMBER, Engine.MIN_RANDOM_NUMBER);
            questions[i] = Integer.toString(currentRandomNumber);
            rightAnswers[i] = (currentRandomNumber % 2 == 0) ? "yes" : "no";
        }

        Engine.game(descriptionOfGame, questions, rightAnswers);
    }
}
