/*
 * Challenge 2 - Sum Multiplier
Problem: For this challenge you will determine if two numbers can be multiplied to some specific number.
Have the function SumMultiplier(arr) take the array of numbers stored in arr and return the 
string true if any two numbers can be multiplied so that the answer is greater than double the 
sum of all the elements in the array. If not, return the string false. 
For example: if arr is [2, 5, 6, -6, 16, 2, 3, 6, 5, 3] then the sum of all these elements is 
42 and doubling it is 84. There are two elements in the array, 16 * 6 = 96 and 96 is greater than 84, 
so your program should return the string true.
 */




public class SumMultiplierDemo {

    private static String sumMultiplier(int arr[]) {
        int doubleSum = 0;
        for (int i = 0; i < arr.length; i++) {
            doubleSum += arr[i];
        }
        doubleSum *= 2;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length - 1; j++) {
                if (arr[i] * arr[j] > doubleSum) {
                    System.out.println("muliti : " + arr[i] + " " + arr[j] + " " + (arr[i] * arr[j]));
                    return "true";
                }
            }
        }
        return "false";
    }

    public static void main(String[] args) {
        int intArr[] = {4, 5, 5, 5, 12};
        // int intArr[] = {2, 5, 6, -6, 16, 2, 3, 6, 5, 3};
        System.out.println( sumMultiplier(intArr));
    }
}