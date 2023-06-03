/*
 * Challenge 3 - ClosestEnemy
Problem: Write a function that takes in a 1D array, where the integers 1 and 0 represent enemies and empty spaces respectively. The function should find the shortest distance between the player (integer 2) and the nearest enemy (integer 1). The distance can be measured by the number of spaces between the player and the enemy in the horizontal direction.
For example, given the following array: array = [0, 1, 0, 0, 0, 2, 0, 1, 0]
The function should return 2, as the nearest enemy is two spaces away from the player horizontally.
Note:
The player and enemies can be located anywhere in the array.
The player will always be present in the array.
There can be zero or more enemy present in the array.
 */

 public class ClosestEnemy {

    private static int findClosestEnemy(int[] array) {
        int minDistance = -1;
        return minDistance;
    }

    public static void main(String[] args) {
        System.out.println(findClosestEnemy(new int[]{0, 1, 0, 0, 0, 2, 0, 1, 0}));
    }
 }