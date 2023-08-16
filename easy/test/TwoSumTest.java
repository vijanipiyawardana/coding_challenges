import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.Arrays;
import java.util.stream.Stream;

public class TwoSumTest {

    @ParameterizedTest
    @MethodSource("testCases")
    public void testTwoSumAll(int[] nums, int target, int[] expected) {
        TwoSum twoSum = new TwoSum();
        int[] result = twoSum.twoSum(nums, target);
        System.out.println(Arrays.toString(expected) + " ---- " + Arrays.toString(result));
        assertArrayEquals(expected, result);
        assertEquals(1, 2);
    }

    private static Stream<Arguments> testCases() {
        return Stream.of(
            Arguments.of(new int[]{2, 7, 11, 15}, 9, new int[]{0, 1}),
            Arguments.of(new int[]{3, 2, 4}, 6, new int[]{1, 2}),
            Arguments.of(new int[]{0, 4, 3, 0}, 0, new int[]{0, 3})
        );
    }

    @Test
    public void testTwoSum() {
        TwoSum twoSum = new TwoSum();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] expected = {0, 1};
        int[] result = twoSum.twoSum(nums, target);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testNoSolution() {
        TwoSum twoSum = new TwoSum();
        int[] nums = {2, 7, 11, 15};
        int target = 99;
        int[] result = twoSum.twoSum(nums, target);
        assertNull(result);
    }
}