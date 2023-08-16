/*
* Hackerrank Problem Solving (Basic) Q2 answer
*/

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'stringAnagram' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. STRING_ARRAY dictionary
     *  2. STRING_ARRAY query
     */

    public static List<Integer> stringAnagram(List<String> dictionary, List<String> query) {
    
    Map<String, Integer> anagramCount = new HashMap<>();
    for(String checkQuery: query){
        for(String checkDictionary: dictionary){
            //System.out.println(areAnagram(checkQuery,checkDictionary));
            if(areAnagram(checkQuery, checkDictionary) == true){
                Integer value = anagramCount.get(checkQuery);
                if(value == null)
                    anagramCount.put(checkQuery, 1);
                else    
                    anagramCount.put(checkQuery, value + 1);
            }
        }
        
    }
    List<Integer> counts = new ArrayList<>();
    for(Map.Entry<String, Integer> entry : anagramCount.entrySet()){
        //System.out.println(" test :" + entry.getKey() + " " + entry.getValue());
        counts.add(entry.getValue());
    }

    int less = query.size() - counts.size();
    for(int i=0; i<less; i++)
        counts.add(0);
    Collections.sort(counts);
    Collections.reverse(counts);
   
    return counts;

    }
    
    public static boolean areAnagram(String word1, String word2){
        int length1 = word1.length();
        int length2 = word2.length();
        char[] word1Array = word1.toCharArray();
        char[] word2Array = word2.toCharArray();
        if(length1 != length2)
            return false;
        Arrays.sort(word1Array);
        Arrays.sort(word2Array);
        for(int i = 0; i<length1; i++){
            if(word1Array[i] != word2Array[i])
                return false;
        }
        return true;   
    }

}

public class HackerrankPSBSolution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int dictionaryCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> dictionary = IntStream.range(0, dictionaryCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .collect(toList());

        int queryCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> query = IntStream.range(0, queryCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .collect(toList());

        List<Integer> result = Result.stringAnagram(dictionary, query);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining("\n"))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}

