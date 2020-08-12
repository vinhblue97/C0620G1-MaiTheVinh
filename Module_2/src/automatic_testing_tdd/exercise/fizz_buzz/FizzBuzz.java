package automatic_testing_tdd.exercise.fizz_buzz;

public class FizzBuzz {
    public static String findResultFizzBuzz(int number) {
        boolean isLowerThanZero = number <= 0;
        if (isLowerThanZero) {
            return "";
        } else {
            if (isFizz(number)) {
                return "Fizz";
            } else if (isBuzz(number)) {
                return "Buzz";
            } else if (isFizzBuzz(number)) {
                return "FizzBuzz";
            } else {
                return number + "";
            }
        }
    }

    public static boolean isFizz(int number) {
        return number % 3 == 0;
    }

    public static boolean isBuzz(int number) {
        return number % 5 == 0;
    }

    public static boolean isFizzBuzz(int number) {
        return isFizz(number) && isBuzz(number);
    }
}
