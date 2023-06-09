/*
* Challenge 5 - Disemvowel Trolls
Problem: Trolls are attacking your comment section! A common way to deal with this situation is to remove 
all of the vowels from the trolls' comments, neutralizing the threat.
Your task is to write a function that takes a string and return a new string with all vowels removed.
For example, the string "This website is for losers LOL!" would become "Ths wbst s fr lsrs LL!".
Note: for this kata y isn't considered a vowel.
*/ 

class DisemvowelTrolls {

    private static String removeVowels(String text) {
        return text.replaceAll("[aeiouAEIOU]", "");  
    }

    public static void main(String args[]) {
        System.out.println(removeVowels("This website is for losers LOL!"));
        System.out.println(removeVowels("No offense but,\nYour writing is among the worst I've ever read"));
        System.out.println(removeVowels("What are you, a communist?"));
    }
}