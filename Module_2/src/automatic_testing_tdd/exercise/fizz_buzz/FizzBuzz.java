package automatic_testing_tdd.exercise.fizz_buzz;

public class FizzBuzz {
    public static String findResultFizzBuzz(int number) {
        boolean isLowerThanZero = number <= 0;
        boolean isGreaterThan100 = number >= 100;
        if (isLowerThanZero || isGreaterThan100) {
            return "";
        } else {
            if (number % 3 == 0) {
                return "Fizz";
            } else if (number % 5 == 0) {
                return "Buzz";
            }
            if (number % 3 == 0 && number % 5 == 0) {
                return "FizzBuzz";
            } else {
                return readNumber(number);
            }
        }
    }

    public static String readNumber(int number) {
        int unitNum = number % 10;
        int dozensNum = (number - unitNum) / 10;
        String stringUnitNum = "";
        String stringDozensNum = "";
        stringUnitNum = getNumber(unitNum, stringUnitNum);
        stringDozensNum = getNumber(dozensNum, stringDozensNum);
        return stringDozensNum + " " + stringUnitNum;
    }

    private static String getNumber(int Num, String stringNum) {
        switch (Num) {
            case 0:
                stringNum = "khong";
                break;
            case 1:
                stringNum = "mot";
                break;
            case 2:
                stringNum = "hai";
                break;
            case 3:
                stringNum = "ba";
                break;
            case 4:
                stringNum = "bon";
                break;
            case 5:
                stringNum = "nam";
                break;
            case 6:
                stringNum = "sau";
                break;
            case 7:
                stringNum = "bay";
                break;
            case 8:
                stringNum = "tam";
                break;
            case 9:
                stringNum = "chin";
                break;
        }
        return stringNum;
    }


}

