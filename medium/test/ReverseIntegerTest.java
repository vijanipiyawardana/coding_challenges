package medium.test;

import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import medium.java.ReverseInteger;

import static org.junit.Assert.assertEquals;

public class ReverseIntegerTest {

    ReverseInteger reverseInt = new ReverseInteger();

    @ParameterizedTest
    @CsvSource({"123, 321", "120, 21"})
    public void testReverseInteger(int x, int ans) {
        assertEquals(reverseInt.reverse(x), ans);
    }

    @Test
    public void testReverseIntegerNegative() {
        int result = reverseInt.reverse(-123);
        assertEquals(result, -321);
    }

    @Test
    public void testReverseIntegerBig() {
        int result = reverseInt.reverse(1534236469);
        assertEquals(result, 0);
    }
    
}
