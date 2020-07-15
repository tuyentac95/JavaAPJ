package triangle;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTest {
    @Test
    @DisplayName("Testing 2, 2, 2")
    public void testClassifyTriangle01() {
        double firstSide = 2;
        double secondSide = 2;
        double thirdSide = 2;

        String expected = "equilateral triangle";
        String result = TriangleClassifier.classifyTriangle(firstSide,secondSide,thirdSide);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing 2, 2, 3")
    public void testClassifyTriangle02() {
        double firstSide = 2;
        double secondSide = 2;
        double thirdSide = 3;

        String expected = "isosceles triangle";
        String result = TriangleClassifier.classifyTriangle(firstSide,secondSide,thirdSide);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing 3, 4, 5")
    public void testClassifyTriangle03() {
        double firstSide = 3;
        double secondSide = 4;
        double thirdSide = 5;

        String expected = "normal triangle";
        String result = TriangleClassifier.classifyTriangle(firstSide,secondSide,thirdSide);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing 8, 2, 3")
    public void testClassifyTriangle04() {
        double firstSide = 8;
        double secondSide = 2;
        double thirdSide = 3;

        String expected = "not triangle";
        String result = TriangleClassifier.classifyTriangle(firstSide,secondSide,thirdSide);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing -1, 2, 1")
    public void testClassifyTriangle05() {
        double firstSide = -1;
        double secondSide = 2;
        double thirdSide = 1;

        String expected = "not triangle";
        String result = TriangleClassifier.classifyTriangle(firstSide,secondSide,thirdSide);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing 0, 1, 1")
    public void testClassifyTriangle06() {
        double firstSide = 0;
        double secondSide = 1;
        double thirdSide = 1;

        String expected = "not triangle";
        String result = TriangleClassifier.classifyTriangle(firstSide,secondSide,thirdSide);
        assertEquals(expected, result);
    }
}