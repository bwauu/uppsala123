package PlayGroundNStuff;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * A program that gets integers from user via terminal and prints
 * average and how many who was unique. The program can handle wrong inputs
 * which will give an error message.
 * @author Ella Söderqvist
 * @version 1.0
 * since 2020-12-13
 */


public class labb3 {

    /**
     * Program entry point.
     * Gets input from user and can notice if the user inserts text instead of integers in the second input.
     * Calculates average.
     *
     * @param args not used
     */
    public static void main(String[] args) {

        System.out.println("How many positive numbers do you want to enter?");
        Scanner input = new Scanner(System.in);

        // try {
        int num = input.nextInt();
        int[] numbers = new int[num];
        int sum = 0;
        int avgNum;





        // } catch (RuntimeException e) { // <-- NegativeNumberExeception här ist?
        //     System.out.println("Invalid input, run program again and give ONLY positive integers");


        try {
            System.out.println("Enter the " + num + " numbers now.");
            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = input.nextInt();
            }

        } catch (InputMismatchException e) {
            System.out.println("Invalid input, run program again and give ONLY integers");
            input.nextLine();
        }


        for (int i : numbers)
            sum += i;
        avgNum = sum / numbers.length;
        System.out.println("The average of the list of numbers is: " + avgNum);


        System.out.println("You have " + numUnique(numbers) + " unique numbers");

    }

    /**
     * Gets integers from my array numbers with help of for loops at if-statements.
     * @param numbers value (inclusive)
     * @return unique integers from user input
     */

    public static int numUnique ( int[] numbers){
        int count = 0;
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length && numbers[i] != numbers[j]; j++) {

                if (j == numbers.length - 1 && numbers[i] != numbers[j]) {
                    count++;
                }

            }

        }
        return count;
    }
}
