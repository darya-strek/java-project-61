package hexlet.code.games;

public class Utils {
    public static int generateRangomNumber(int max, int min) {
        return (int) Math.floor(Math.random() * (max - min + 1)) + min;
    }
}
