package automatic_testing_tdd.exercise.fizz_buzz;

public class FizzBuzz {
    public static String findResultFizzBuzz(int number) {
        boolean isLowerThanZero = number <= 0;
        boolean isGreaterThan100 = number >= 100;
        if (isLowerThanZero || isGreaterThan100) {
            return "";
        } else {
            if (isFizz(number)) {
                return "Fizz";
            } else if (isBuzz(number)) {
                return "Buzz";
            } else if (isFizzBuzz(number)) {
                return "FizzBuzz";
            } else {
                return readNumber(number);
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

    public static String readNumber(int number) {
        int unitNum = number % 10;
        int dozensNum = (number - unitNum) / 10;
        String stringUnitNum = "";
        String stringDozensNum = "";
        stringUnitNum = getUnitNumber(unitNum, dozensNum, stringUnitNum);
        stringDozensNum = getDozenNumber(dozensNum, stringDozensNum);
        return stringDozensNum + " " + stringUnitNum;
    }

    private static String getUnitNumber(int unitNum, int dozensNum, String stringUnitNum) {
        switch (unitNum) {
            case 0:
                boolean isEqualByOne = dozensNum == 1;
                boolean isGreaterThanTwo = dozensNum >= 2;
                if (isEqualByOne) {
                    stringUnitNum = "";
                } else {
                    if (isGreaterThanTwo) {
                        stringUnitNum = "muoi";
                    } else {
                        stringUnitNum = "khong";
                    }
                }
                break;
            case 1:
                stringUnitNum = "mot";
                break;
            case 2:
                stringUnitNum = "hai";
                break;
            case 3:
                stringUnitNum = "ba";
                break;
            case 4:
                stringUnitNum = "bon";
                break;
            case 5:
                stringUnitNum = "nam";
                break;
            case 6:
                stringUnitNum = "sau";
                break;
            case 7:
                stringUnitNum = "bay";
                break;
            case 8:
                stringUnitNum = "tam";
                break;
            case 9:
                stringUnitNum = "chin";
                break;
        }
        return stringUnitNum;
    }

    private static String getDozenNumber(int dozensNum, String stringDozensNum) {
        switch (dozensNum) {
            case 1:
                stringDozensNum = "muoi";
                break;
            case 2:
                stringDozensNum = "hai";
                break;
            case 3:
                stringDozensNum = "ba";
                break;
            case 4:
                stringDozensNum = "bon";
                break;
            case 5:
                stringDozensNum = "nam";
                break;
            case 6:
                stringDozensNum = "sau";
                break;
            case 7:
                stringDozensNum = "bay";
                break;
            case 8:
                stringDozensNum = "tam";
                break;
            case 9:
                stringDozensNum = "chin";
                break;
        }
        return stringDozensNum;
    }
}

