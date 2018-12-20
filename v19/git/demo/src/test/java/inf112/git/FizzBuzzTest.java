package inf112.git;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class FizzBuzzTest {

    private FizzBuzz fizzBuzz;

    @Before
    public void setUp() throws Exception {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void testLowerBoundRegularNumber() {
        assertEquals("0", fizzBuzz.compute(0));
    }

    @Test
    public void testRegularNumber() {
        assertEquals("1", fizzBuzz.compute(1));
    }

    @Test
    public void test7ReturnsFizz() {
        assertEquals("fizz", fizzBuzz.compute(7));
    }

    @Test
    public void testFiveReturnsBuzz() {
        assertEquals("buzz", fizzBuzz.compute(5));
    }

    @Test
    public void test35ReturnsFizzBuzz() {
        assertEquals("fizzbuzz", fizzBuzz.compute(35));
    }

    @Test
    public void test21ReturnsFizz() {
        assertEquals("fizz", fizzBuzz.compute(21));
    }

    @Test
    public void test25ReturnsBuzz() {
        assertEquals("buzz", fizzBuzz.compute(25));
    }
}