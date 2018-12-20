package inf112.git;

public class FizzBuzz {

    public String compute(int number) {
        if (isHigherThanLowerBound(number) && isFizz(number) && isBuzz(number)) {
            return "fizzbuzz";
        }
        if (isHigherThanLowerBound(number) && isFizz(number)) {
            return "fizz";
        }
        if (isHigherThanLowerBound(number) && isBuzz(number)) {
            return "buzz";
        }
        return String.valueOf(number);
    }

    private boolean isBuzz(int number) {
        return number % 5 == 0;
    }

    private boolean isFizz(int number) {
        return number % 7 == 0;
    }

    private boolean isHigherThanLowerBound(int number) {
        return number > 0;
    }
}
