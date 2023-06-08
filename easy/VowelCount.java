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

    // method 1
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

    // method 2
    public static int getCount1(String str) {
        return str.replaceAll("(?i)[^aeiou]", "").length();
    }

    // method 3
    public static int getCount2(String str) {
        int vowelsCount = 0;
        
        for(char c : str.toCharArray())
          vowelsCount += (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') ? 1 : 0;
        
        return vowelsCount;
      }

    public static void main(String[] args) {
        System.out.println(vowelCount("All cows eat grass"));
        System.out.println(vowelCount("Why fly"));

        System.out.println(getCount1("All cows eat grass"));
        System.out.println(getCount1("Why fly"));

        System.out.println(getCount2("All cows eat grass"));
        System.out.println(getCount2("Why fly"));
    }
}
