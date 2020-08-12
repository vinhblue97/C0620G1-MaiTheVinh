package automatic_testing_tdd.exercise.classify_triangle;

public class TriangleClassifier {

    public static String classifyTriangle(double firstSide, double secondSide, double thirdSide) {
        if (isTriangle(firstSide, secondSide, thirdSide)) {
            if (isEquilateral(firstSide, secondSide, thirdSide)) {
                return "The Equilateral Triangle";
            } else if (isIsosceles(firstSide, secondSide, thirdSide)) {
                return "The Isosceles Triangle";
            } else return "The Normal Triangle";
        } else return "Non Triangle";
    }

    public static boolean isTriangle(double firstSide, double secondSide, double thirdSide) {
        boolean isGreaterThanThirdSide = firstSide + secondSide > thirdSide;
        boolean isGreaterThanFirstSide = secondSide + thirdSide > firstSide;
        boolean isGreaterThanSecondSide = firstSide + thirdSide > secondSide;
        return isGreaterThanThirdSide && isGreaterThanFirstSide && isGreaterThanSecondSide;
    }

    public static boolean isEquilateral(double firstSide, double secondSide, double thirdSide) {
        boolean isEqualFirstSideToSecondSide = firstSide == secondSide;
        boolean isEqualSecondSideToThirdSide = secondSide == thirdSide;
        return isEqualFirstSideToSecondSide && isEqualSecondSideToThirdSide;
    }

    public static boolean isIsosceles(double firstSide, double secondSide, double thirdSide) {
        boolean isEqualFirstSideToSecondSide = firstSide == secondSide;
        boolean isEqualSecondSideToThirdSide = secondSide == thirdSide;
        boolean isEqualFirstSideToThirdSide = firstSide == thirdSide;
        return isEqualFirstSideToSecondSide || isEqualSecondSideToThirdSide || isEqualFirstSideToThirdSide;
    }
}
