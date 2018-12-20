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
    public void testThreeReturnsFizz() {
        assertEquals("fizz", fizzBuzz.compute(3));
    }

    @Test
    public void testFiveReturnsBuzz() {
        assertEquals("buzz", fizzBuzz.compute(5));
    }

    @Test
    public void test15ReturnsFizzBuzz() {
        assertEquals("fizzbuzz", fizzBuzz.compute(15));
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