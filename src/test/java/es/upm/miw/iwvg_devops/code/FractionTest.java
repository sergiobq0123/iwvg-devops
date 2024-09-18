package es.upm.miw.iwvg_devops.code;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FractionTest {
    private Fraction fraction;

    @BeforeEach
    void setUp() {
        fraction = new Fraction(3, 4);
    }

    @Test
    void testFractionConstructorWithoutParams() {
        Fraction defaultFraction = new Fraction();
        assertEquals(1, defaultFraction.getNumerator());
        assertEquals(1, defaultFraction.getDenominator());
    }

    @Test
    void testFractionConstructorWithParams() {
        assertEquals(3, fraction.getNumerator());
        assertEquals(4, fraction.getDenominator());
    }

    @Test
    void testGetNumerator() {
        assertEquals(3, fraction.getNumerator());
    }

    @Test
    void testSetNumerator() {
        fraction.setNumerator(5);
        assertEquals(5, fraction.getNumerator());
    }

    @Test
    void testGetDenominator() {
        assertEquals(4, fraction.getDenominator());
    }

    @Test
    void testSetDenominator() {
        fraction.setDenominator(6);
        assertEquals(6, fraction.getDenominator());
    }

    @Test
    void testDecimal() {
        assertEquals(0.75, fraction.decimal(), 0.0001);
    }
}
