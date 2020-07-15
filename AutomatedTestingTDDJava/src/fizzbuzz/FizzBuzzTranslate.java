package fizzbuzz;

public class FizzBuzzTranslate {
    public static String translateFizzBuzz(int number) {
        boolean isPositive = number > 0;
        boolean isNumberDivisibleBy3 = number % 3 == 0;
        boolean isNumberDivisibleBy5 = number % 5 == 0;
        if (!isPositive) return "Unsupported";
        if (isNumberDivisibleBy3 && isNumberDivisibleBy5) return "FizzBuzz";
        if (isNumberDivisibleBy3) return  "Fizz";
        if (isNumberDivisibleBy5) return "Buzz";
        else return String.valueOf(number);
    }
}
