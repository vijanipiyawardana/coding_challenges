/*
 * Challenge 4 - Vowel Count
Problem: Have the function VowelCount(str) take the str string parameter being passed and return
the number of vowels the string contains (ie. “All cows eat grass” would return 5). Do not count 
y as a vowel for this challenge.
 */

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class VowelCount {

    private static Set<Character> vowelSet = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));

    private static int vowelCount(String str) {
        int vowelCount = 0;
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            if (vowelSet.contains(str.charAt(i))) {
                vowelCount++;
            }
        }
        return vowelCount;
    }
    public static void main(String[] args) {
        System.out.println(vowelCount("All cows eat grass"));
        System.out.println(vowelCount("Why fly"));
    }
}
