package inf112.tdd.demo;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumeralConverterTest {

    RomanNumeralConverter converter;

    @BeforeEach
    public void setUp() throws Exception {
        converter = new RomanNumeralConverter();
    }

    @Test
    public void oneConvertsToI() {
        assertEquals("I", converter.convert(1));
    }

    @Test
    public void twoConvertsToII() {
        assertEquals("II", converter.convert(2));
    }

    @Test
    public void threeConvertsToIII() {
        assertEquals("III", converter.convert(3));
    }

    @Test
    public void fourConvertsToIV() {
        assertEquals("IV", converter.convert(4));
    }

    @Test
    public void fiveConvertsToV() {
        assertEquals("V", converter.convert(5));
    }
}
