package Templates;
/* Skriv ett program som med hjälp av kommandofönstret tar in ett antal heltal för att sedan skriva ut medelvärdet
och hur många av talen som var unika.
Programmet ska även kunna hantera felaktig input och då skriva ut lämpligt felmeddelande.*/


import java.util.Scanner;


public class AverageCalculatorXUniqueInts {

    public static void main(String[] args) {
        int[] numbers = new int[10]; // gör dynamisk

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = getUserInput();
        }
        System.out.println("Du angav x tal. Medelvärdet är " + calculateAverage(numbers) +
                ". Tal som var unika var " + calculateUniueInts(numbers));
    }

    public static int getUserInput() /*Denna metod tar in tal från user*/ {
        Scanner scanner = new Scanner(System.in);
        String input;
        int number = -1;


        while (number < 0 || number > 10) {
            System.out.println("Ange ett antal heltal");
            input = scanner.nextLine(); // metod ta in allt user skriver in innan user trycker enter.

            try {
                number = Integer.parseInt(input);

                if(number < 0 || number > 10){
                    System.out.println("Endast heltal pls!");
                }
            }
            catch (NumberFormatException nfe) {
                System.out.println("Endast heltal pls!");
            }
        }
        return number;
    }



    public static int calculateAverage(int[] n) /*Denna metod returnerar medelvärdet av input heltalen*/ {
        return 0;
    }

    public static int calculateUniueInts(int[] n) /*Denna metod returnerar unika heltal från av input */ {
        return 0;
    }
}
