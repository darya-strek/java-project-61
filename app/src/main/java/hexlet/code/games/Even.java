package hexlet.code.games;

import hexlet.code.Engine;

public class Even {
    public static void startGameEven() {

        int step = 0;
        int maxStep = 3;

        String descriptionOfGame = "Answer 'yes' if the number is even, otherwise answer 'no'";

        String[] questions = new String[maxStep];
        String[] rightAnswers = new String[maxStep];

        for (var i = step; i < maxStep; i += 1) {
            int previewQuestion = (int) (Math.random() * 100 + 1);
            questions[i] = Integer.toString(previewQuestion);
            rightAnswers[i] = (previewQuestion % 2 == 0) ? "yes" : "no";
        }

        Engine.game(descriptionOfGame, questions, rightAnswers);
    }
}
