package absconculator;

public class AbsoluteNumberCalculator {
    public static int findAbsolute(int number) {
        if (number >= 0) {
            return number;
        } else {
            return -number;
        }
    }
}
