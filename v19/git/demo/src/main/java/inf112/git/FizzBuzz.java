package inf112.git;

public class FizzBuzz {

    public String compute(int number) {
        if (number > 0 && number % 3 == 0 && number % 5 == 0) {
            return "fizzbuzz";
        }
        if (number > 0 && number % 3 == 0) {
            return "fizz";
        }
        if (number > 0 && number % 5 == 0) {
            return "buzz";
        }
        return String.valueOf(number);
    }
}
