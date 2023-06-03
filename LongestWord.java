/*
 * Challenge 1 - Longest Word
Have the function LongestWord(sen) take the sen parameter being passed and return the longest word 
in the string. If there are two or more words that are the same length, return the first word from 
the string with that length. Ignore punctuation and assume sen will not be empty. Words may also 
contain numbers, for example "Hello world123 567"
 */

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class LongestWord {
    
      public static void main (String[] args) {      
        Scanner input = new Scanner(System.in);
        System.out.println(findLongestWord(input.nextLine())); 
        input.close();
      }
      private static String findLongestWord(String sen) {
        List<String> words = Arrays.asList(sen.split(" "));
        return words.stream()
             .map(w -> w.replaceAll("[^a-zA-Z0-9]", ""))
             .sorted((w1, w2) -> w2.length() - w1.length())
             .findFirst()
             .orElse("");
      }
    
}
