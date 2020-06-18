package Week2.Day4.BT1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {

    @Test
    void TestDay1Month1Year2018() {
        int day = 1;
        int month = 1;
        int year = 2018;

        String expected = "Day: 1/1/2018\n Next day: 2/1/2018";
        String result = NextDayCalculator.dayToSearch(day, month, year);
        assertEquals(expected, result);
    }

    @Test
    void TestDay31Month1Year2018() {
        int day = 31;
        int month = 1;
        int year = 2018;

        String expected = "Day: 31/1/2018\n Next day: 1/2/2018";
        String result = NextDayCalculator.dayToSearch(day, month, year);
        assertEquals(expected, result);
    }

    @Test
    void TestDay30Month4Year2018() {
        int day = 30;
        int month = 4;
        int year = 2018;

        String expected = "Day: 30/4/2018\n Next day: 1/5/2018";
        String result = NextDayCalculator.dayToSearch(day, month, year);
        assertEquals(expected, result);
    }

    @Test
    void TestDay28Month2Year2018() {
        int day = 28;
        int month = 2;
        int year = 2018;

        String expected = "Day: 28/2/2018\n Next day: 1/3/2018";
        String result = NextDayCalculator.dayToSearch(day, month, year);
        assertEquals(expected, result);
    }

    @Test
    void TestDay29Month2Year2020() {
        int day = 29;
        int month = 2;
        int year = 2020;

        String expected = "Day: 29/2/2020\n Next day: 1/3/2020";
        String result = NextDayCalculator.dayToSearch(day, month, year);
        assertEquals(expected, result);
    }

    @Test
    void TestDay31Month12Year2018() {
        int day = 31;
        int month = 12;
        int year = 2018;

        String expected = "Day: 31/12/2018\n Next day: 1/1/2019";
        String result = NextDayCalculator.dayToSearch(day, month, year);
        assertEquals(expected, result);
    }
}