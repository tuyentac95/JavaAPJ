package fizzbuzz;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTranslateTest {
    @Test
    @DisplayName("Testing 9")
    public void testFizzBuzz01() {
        int number = 9;
        String expected = "Fizz";
        String result = FizzBuzzTranslate.translateFizzBuzz(number);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing 10")
    public void testFizzBuzz02() {
        int number = 10;
        String expected = "Buzz";
        String result = FizzBuzzTranslate.translateFizzBuzz(number);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing 15")
    public void testFizzBuzz03() {
        int number = 15;
        String expected = "FizzBuzz";
        String result = FizzBuzzTranslate.translateFizzBuzz(number);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing 0")
    public void testFizzBuzz04() {
        int number = 0;
        String expected = "Unsupported";
        String result = FizzBuzzTranslate.translateFizzBuzz(number);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing -1")
    public void testFizzBuzz05() {
        int number = -3;
        String expected = "Unsupported";
        String result = FizzBuzzTranslate.translateFizzBuzz(number);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing 26")
    public void testFizzBuzz06() {
        int number = 26;
        String expected = "26";
        String result = FizzBuzzTranslate.translateFizzBuzz(number);
        assertEquals(expected, result);
    }

}