package PlayGroundNStuff;

import java.util.Scanner;

/**
 * A program that gets 10 integers between 0 and 9 from user via terminal and prints
 * average and mode.
 * @author Thomas Ejnefjäll
 * @version 1.0
 */
public class Medium {
    /**
     * Program entry point.
     * @param args not used
     */
    public static void main(String[] args) {
        int min = 0, max = 9;
        int[] numbers = new int[10];

        for(int i = 0; i < numbers.length; i ++) {
            numbers[i] = getUserInput(min , max);
        }
        System.out.println("Du angav 10 tal. Medelvärdet är " + calculateAverage(numbers) +
                " och typvärdet är " + calculateMode(numbers, min, max));
    }
    /**
     * Calculate average.
     * @param n the number we want to calculate average for
     * @return average
     */
    public static int calculateAverage(int[] n) {
        int sum = 0;

        for(int i : n) {
            sum += i;
        }
        return sum / n.length;
    }
    /**
     * Calculate mode from the provided numbers
     * @param n the numbers we want to calculate mode from
     * @param min min value among provided numbers
     * @param max max value among provided numbers
     * @return mode
     */
    public static int calculateMode(int[] n, int min, int max) {
        int[] frequency = new int[max - min + 1];

        for(int i : n) {
            frequency[i - min] ++;
        }
        int mode = 0;

        for(int i = 1; i < frequency.length; i ++) {
            if(frequency[i] > frequency[mode]) {
                mode = i;
            }
        }
        return mode + min;
    }
    /**
     * Get integer between min and max (inclusive) from user via terminal.
     * @param min min value (inclusive)
     * @param max max value (inclusive)
     * @return integer value provided by user
     */
    public static int getUserInput(int min, int max) {
        Scanner scanner = new Scanner(System.in);
        String input = null;
        int number = min - 1;

        while(number < min || number > max) {
            System.out.print("Ange heltal mellan " + min + " och " +  max + ": ");
            input = scanner.nextLine();

            try {
                number = Integer.parseInt(input);

                if(number < min || number > max) {
                    System.out.println("Endast heltal mellan " + min + " och " +  max + " får anges");
                }
            }
            catch(NumberFormatException nfe) {
                System.out.println("Endast heltal mellan " + min + " och " +  max + " får anges");
            }
        }
        return number;
    }
}

