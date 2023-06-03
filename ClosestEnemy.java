/*
 * Challenge 3 - ClosestEnemy
Problem: Write a function that takes in a 1D array, where the integers 1 and 0 represent enemies and empty spaces respectively. The function should find the shortest distance between the player (integer 2) and the nearest enemy (integer 1). The distance can be measured by the number of spaces between the player and the enemy in the horizontal direction.
For example, given the following array: array = [0, 2, 0, 0, 0, 1, 0, 2, 0]
The function should return 2, as the nearest enemy is two spaces away from the player horizontally.
Note:
The player and enemies can be located anywhere in the array.
The player will always be present in the array.
There can be zero or more enemy present in the array.
 */

 public class ClosestEnemy {

    private static int findClosestEnemy(int[] array) {
        int myIndex = -1;
        int leftEnemyIndex = -1;
        int rightEnemyIndex = -1;

        int minDistance = -1;
        int leftDistance = -1;
        int rightDistance = -1;

        // find index for 1
        for(int i = 0; i < array.length; i++) {
            if(array[i] == 1) {
                myIndex = i;
            }
        }

        // find index for closest enemy in right to the 1
        for(int i = myIndex; i < array.length; i++) {
            if(array[i] == 2) {
                rightEnemyIndex = i;
                break;
            }
        }

        // find index for closest enemy in left to the 1
        for(int i = myIndex; i >= 0; i--) {
            if(array[i] == 2) {
                leftEnemyIndex = i;
                break;
            }
        }

        if(leftEnemyIndex != -1) {
            leftDistance = myIndex - leftEnemyIndex;
        }

        if(rightEnemyIndex != -1) {
            rightDistance = rightEnemyIndex - myIndex;
        }
       
        if(leftDistance != -1 || rightDistance != -1) {
            minDistance = Math.min(leftDistance, rightDistance);
        }

        if(leftDistance == -1) {
            minDistance = rightDistance;
        }

        if(rightDistance == -1) {
            minDistance = leftDistance; 
        }

        System.out.println(myIndex);
        System.out.println(leftEnemyIndex);
        System.out.println(rightEnemyIndex);
        System.out.println(leftDistance);
        System.out.println(rightDistance);

        return minDistance;
    }


    public static void main(String[] args) {
        System.out.println("min distance :" + findClosestEnemy(new int[]{0, 2, 0, 0, 0, 1, 0, 2, 0}));
        System.out.println();
        System.out.println("min distance :" + findClosestEnemy(new int[]{2, 0, 2, 0, 0, 1, 0, 0, 0}));
        System.out.println();
        System.out.println("min distance :" + findClosestEnemy(new int[]{0, 1, 0}));
        System.out.println();
        System.out.println("min distance :" + findClosestEnemy(new int[]{0, 0, 1, 0, 2, 2, 0}));
    }
 }