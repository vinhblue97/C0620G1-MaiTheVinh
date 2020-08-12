package automatic_testing_tdd.exercise.classify_triangle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TriangleClassifierTest {

    @Test
    void classifyTriangle1() {
        double firstSide = 2.0;
        double secondSide = 2.0;
        double thirdSide = 2.0;
        String expected = "The Equilateral Triangle";

        String result = TriangleClassifier.classifyTriangle(firstSide, secondSide, thirdSide);
        assertEquals(expected,result);
    }

    @Test
    void classifyTriangle2() {
        double firstSide = 2.0;
        double secondSide = 2.0;
        double thirdSide = 3.0;
        String expected = "The Isosceles Triangle";

        String result = TriangleClassifier.classifyTriangle(firstSide, secondSide, thirdSide);
        assertEquals(expected,result);
    }

    @Test
    void classifyTriangle3() {
        double firstSide = 3.0;
        double secondSide = 4.0;
        double thirdSide = 5.0;
        String expected = "The Normal Triangle";

        String result = TriangleClassifier.classifyTriangle(firstSide, secondSide, thirdSide);
        assertEquals(expected,result);
    }

    @Test
    void classifyTriangle4() {
        double firstSide = 8.0;
        double secondSide = 2.0;
        double thirdSide = 3.0;
        String expected = "Non Triangle";

        String result = TriangleClassifier.classifyTriangle(firstSide, secondSide, thirdSide);
        assertEquals(expected,result);
    }

    @Test
    void classifyTriangle5() {
        double firstSide = -1.0;
        double secondSide = 2.0;
        double thirdSide = 1.0;
        String expected = "Non Triangle";

        String result = TriangleClassifier.classifyTriangle(firstSide, secondSide, thirdSide);
        assertEquals(expected,result);
    }

    @Test
    void classifyTriangle6() {
        double firstSide = 0.0;
        double secondSide = 1.0;
        double thirdSide = 1.0;
        String expected = "Non Triangle";

        String result = TriangleClassifier.classifyTriangle(firstSide, secondSide, thirdSide);
        assertEquals(expected,result);
    }
}