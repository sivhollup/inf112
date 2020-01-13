package inf112.tdd;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class RomanNumeralConverterTest {

    private RomanNumeralConverter converter;

    @Before
    public void setUp() throws Exception {
        converter = new RomanNumeralConverter();
    }

    @Test
    public void oneConvertsToI() {
        String result = converter.convert(1);

        assertEquals("I", result);
    }

    @Test
    public void twoConvertsToII() {
        String result = converter.convert(2);

        assertEquals("II", result);
    }

    @Test
    public void fourConvertsToIV() {
        String result = converter.convert(4);
        assertEquals("IV", result);
    }

    @Test
    public void fiveConvertsToV() {
        assertEquals("V", converter.convert(5));
    }

    @Test
    public void nineConvertsToIX() {
        assertEquals("IX", converter.convert(9));
    }

    @Test
    public void tenConvertsToX() {
        assertEquals("X", converter.convert(10));
    }

    @Test
    public void name() {
        for (int i = 0; i < 50; i++) {
            System.out.println(converter.convert(i));
        }
        fail();
    }
}
