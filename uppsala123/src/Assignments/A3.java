package Assignments;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

 /** The program takes input via the command window to enter a number of how many numbers the user wants to store in
  an array.
  The program's output will print:
  1. The users desired size of array
  2. The average of the total numbers in array
  3. How many of those numbers that were unique.
  The program also handle some incorrect inputs.
  A result of a incorrect input
  will print an appropriate error message.
  * @author Benjamin Appelberg
  * @version 1.0
  */

 public class A3 {
    /**
     * Program entry point.
     * @param args not used
     */
    public static void main(String[] args) {
        int numberOfInts = getIntFromUser("Hur många heltal vill du ange:");
        int[] ints = getIntsFromUser("Ange alla heltal:", numberOfInts);
        System.out.println("Du angav " + numberOfInts + " Tal.");
        System.out.println("Varav " + numUnique(ints) + " är unika.");
        System.out.println("Medelvärde för talen är " + average(ints) + ".");
    }

    /**
     * Get integer
     * @param message Displays a String in command window that asks how many integers user want to input
     * @return int result - Desired size array of numbers to store as a integer.
     */
    public static int getIntFromUser(String message) {
        Scanner scanner = new Scanner(System.in);
        boolean done = false;
        int result = 0;
        while (!done) {
            try {
                System.out.println(message);
                result = scanner.nextInt();
                done = true;
            } catch (InputMismatchException e) {
                System.out.println("Ogiltigt värde!");
                scanner.nextLine();
            }

        }
        return result;
    }

    /**
     * Get integers in array
     * @param message Displays a String in command window that asks to give all integers user want to store in array
     * @param numberOfInts Refers to the desired size of array to store input integers
     * @return Array of input integers
     */
    public static int[] getIntsFromUser(String message, int numberOfInts) {
        Scanner scanner = new Scanner(System.in);
        int[] result = new int[numberOfInts];
        boolean done = false;

        while (!done) {

            try {
                System.out.println(message);
                for (int i = 0; i < numberOfInts; i++) {
                    result[i] = scanner.nextInt();
                }
                done = true;
            } catch (InputMismatchException e) {
                System.out.println("Ogiltigt värde!");
                scanner.nextLine();
            }
        }
        return result;
    }

    /**
     * Calculate average
     * @param integers input of integers in array
     * @return average
     */
    public static int average(int[] integers) {
        if (integers.length < 1) {
            return 0;
        }
        int sumOfElements = 0;
        for (int integer : integers) {
            sumOfElements += integer;
        }
        return sumOfElements / integers.length;
    }

    /**
     * Count unique numbers in array
     * @param array Refers to array of integers
     * @return countUnique (Total of unique integers in array)
     */
    public static int numUnique(int[] array){
        Arrays.sort(array);
        if(array.length > 0){
            int countUnique = 0;
            for(int i = 0; i < array.length - 1; i++){
                if(array[i] != array[i+1]){
                    countUnique++;
                }
            }
            return countUnique;
        } else {
            return 0;
        }
    }

}



