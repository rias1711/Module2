package Week2.Day4.BT2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTest {

    @Test
    void equilateralTriangle() {
        int firstSide = 2;
        int secondSide = 2;
        int thirdSide = 2;

        String expected = "Tam giác đều";
        String result = TriangleClassifier.inputClass(firstSide, secondSide, thirdSide);
        assertEquals(expected, result);
    }

    @Test
    void isoscelesTriangle() {
        int firstSide = 2;
        int secondSide = 2;
        int thirdSide = 3;

        String expected = "Tam giác cân";
        String result = TriangleClassifier.inputClass(firstSide, secondSide, thirdSide);
        assertEquals(expected, result);
    }
    @Test
    void normalTriangle() {
        int firstSide = 3;
        int secondSide = 4;
        int thirdSide = 5;

        String expected = "Tam giác thường";
        String result = TriangleClassifier.inputClass(firstSide, secondSide, thirdSide);
        assertEquals(expected, result);
    }
    @Test
    void notATriangle() {
        int firstSide = 8;
        int secondSide = 2;
        int thirdSide = 3;

        String expected = "Không phải là tam giác";
        String result = TriangleClassifier.inputClass(firstSide, secondSide, thirdSide);
        assertEquals(expected, result);
    }
    @Test
    void notATriangle2() {
        int firstSide = -1;
        int secondSide = 2;
        int thirdSide = 1;

        String expected = "Không phải là tam giác";
        String result = TriangleClassifier.inputClass(firstSide, secondSide, thirdSide);
        assertEquals(expected, result);
    }
    @Test
    void notATriangle3() {
        int firstSide = 0;
        int secondSide = 1;
        int thirdSide = 1;

        String expected = "Không phải là tam giác";
        String result = TriangleClassifier.inputClass(firstSide, secondSide, thirdSide);
        assertEquals(expected, result);
    }
}