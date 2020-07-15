package triangle;

public class TriangleClassifier {
    public static String classifyTriangle(double firstSide, double secondSide, double thirdSide) {
        if (firstSide + secondSide > thirdSide && secondSide + thirdSide > firstSide && thirdSide + firstSide > secondSide) {
            if (firstSide == secondSide && firstSide != thirdSide) return "isosceles triangle";
            if (thirdSide == secondSide && firstSide != thirdSide) return "isosceles triangle";
            if (firstSide == thirdSide && firstSide != secondSide) return "isosceles triangle";
            if (firstSide == secondSide && firstSide == thirdSide) return "equilateral triangle";
            else return "normal triangle";
        }
        else return "not triangle";
    }
}
