package telran.introduction;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import static telran.introduction.Calculations.divide;
import static telran.introduction.Calculations.isDividedOn;
import static telran.introduction.Calculations.maxDigit;
import static telran.introduction.Calculations.multiply;
import static telran.introduction.Calculations.substract;
import static telran.introduction.Calculations.sum;
import static telran.introduction.Calculations.sumOfDigits;

public class CalculationsTest {

    @Test
    void sumTest() {
        assertEquals(4, sum(2, 2));
    }

    @Test
    void multiplyTest() {
        assertEquals(9, multiply(3, 3));
    }

    @Test
    void divideTest() {
        assertEquals(25, divide(50, 2));
    }

    @Test
    void substractTest() {
        assertEquals(69, substract(70, 1));
    }

    @Test
    void sumOfDigitsTest() {
        assertEquals(35, sumOfDigits(56789));
    }

    @Test
    void maxDigitTest() {
        assertEquals(9, maxDigit(98745));
    }

    @Test
    void isDividedOnTest() {
        assertEquals(true, isDividedOn(121, 11));
        assertEquals(false, isDividedOn(122, 11));
    }
}
