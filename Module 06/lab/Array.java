
/**************************************************************************************
 * Program: Array.java
 * Date:    October 2023
 * This program demonstrates the use of arrays in storing data.
 * The student will enter and process data according to the exercises.
**************************************************************************************/

import java.util.Scanner;

public class Array {

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        final int SIZE = 3; // The size of our array
        int[] array1 = new int[SIZE]; // Array declaration

        // Prompt to enter 'SIZE' number of integers
        for (int i = 0; i < array1.length; i++) {
            System.out.print("Enter an integer: ");
            array1[i] = input.nextInt();
        }
    }
}