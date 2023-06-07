/*
 * Challenge 6 - Digit * Digit
 Problem: Welcome. In this kata, you are asked to square every digit of a number and concatenate them.
For example, if we run 9119 through the function, 811181 will come out, because 9*9 is 81 and 1*1 is 1. 
(81-1-1-81) Example #2: An input of 765 will/should return 493625 because 7*7 is 49, 6*6 is 36, and 5*5 is 25. 
(49-36-25) Note: The function accepts an integer and returns an integer.
 */

import java.util.stream.Collectors;

public class DigitDigit {

    // using for loops
    public static int squareDigits(int n) {

        String stringNum = Integer.toString(n);
        char[] charArr = stringNum.toCharArray();
        int[] intArr = new int[charArr.length];

        for (int i = 0; i < charArr.length; i++) {
            intArr[i] = Integer.parseInt(charArr[i] + "");
            intArr[i] *= intArr[i];
        }
        
        String newStringNum = "";
        for (int i = 0; i < intArr.length; i++) {
            newStringNum = newStringNum.concat(String.valueOf(intArr[i]));
        }

        return Integer.parseInt(newStringNum);
    }

    // using streams
    public static int squareDigitsStream(int n) {
        return Integer.parseInt(String.valueOf(n)
                                      .chars()
                                      .map(i -> Integer.parseInt(String.valueOf((char) i)))
                                      .map(i -> i * i)
                                      .mapToObj(String::valueOf)
                                      .collect(Collectors.joining("")));
    }

    public static void main(String[] args) {
        System.out.println(squareDigits(9119));
        System.out.println(squareDigits(765));

        System.out.println(squareDigitsStream(9119));
        System.out.println(squareDigitsStream(765));
    }
}
