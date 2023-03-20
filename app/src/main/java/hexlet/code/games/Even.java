package hexlet.code.games;

import hexlet.code.Engine;

public class Even {
    public static void startGameEven() {

        String descriptionOfGame = "Answer 'yes' if the number is even, otherwise answer 'no'";

        String[] questions = new String[3];
        String[] rightAnswers = new String[3];

        for (var i = 0; i < 3; i += 1) {
            int previewQuestion = (int) (Math.random() * 100);
            questions[i] = Integer.toString(previewQuestion);
            rightAnswers[i] = (previewQuestion % 2 == 0) ? "yes" : "no";
        }

        Engine.game(descriptionOfGame, questions, rightAnswers);

    }
}
