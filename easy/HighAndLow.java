/*
 * Challenge 6 - High and low 
 Problem: In this little assignment you are given a string of space separated numbers, 
and have to return the highest and lowest number. Examples:
    highAndLow("1 2 3 4 5")  // return "5 1"
    highAndLow("1 2 -3 4 5") // return "5 -3"
    highAndLow("1 9 3 4 -5") // return "9 -5"
Notes: 
    All numbers are valid Int32, no need to validate them.
    There will always be at least one number in the input string.
    Output string must be two numbers separated by a single space, and highest number is first.
 */

import static java.util.Arrays.stream;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class HighAndLow {

    // method 1
    public static String highAndLow(String numbers) {

        String[] arrOfStr = numbers.split(" ");
        int[] intArr = new int[arrOfStr.length];

        for (int i = 0; i < arrOfStr.length; i++) {
            intArr[i] = Integer.parseInt(arrOfStr[i]);
        }

        int min = intArr[0];
        int max = intArr[0];
        for (int i = 1; i < intArr.length; i++) {
            if (intArr[i] > max) {
                max = intArr[i];
            }
            if (intArr[i] < min) {
                min = intArr[i];
            }
        }
        return String.valueOf(max) + " " + String.valueOf(min);
    }

    // method 2
    static String highAndLow1(String numbers) {
        var stats = stream(numbers.split(" ")).mapToInt(Integer::parseInt).summaryStatistics();
        return stats.getMax() + " " + stats.getMin();
    }

    // method 3
    public static String highAndLow2(String numbers) {
        String[] array = numbers.split(" ");
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i=0; i< array.length; i++){
            int value = Integer.parseInt(array[i]);
            if (value < min) min = value;
            if (value > max) max = value;
        }
        return String.format("%d %d", max, min);
    }

    // method 4
    public static String highAndLow3(String numbers) {
        List<Integer> nums = Arrays.stream(numbers.split(" ")).map(Integer::parseInt).toList();
        return "%s %s".formatted(Collections.max(nums), Collections.min(nums));
    }

    public static void main(String[] args) {
        System.out.println(highAndLow("1 2 3 4 5"));
        System.out.println(highAndLow("1 2 -3 4 5"));
        System.out.println(highAndLow("1 9 3 4 -5"));
    }
}
