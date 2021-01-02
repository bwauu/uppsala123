package Uppgift4;

import java.util.List;
import java.util.Map;
import java.util.Scanner;


public class Application {

    static void setLanguage(String language) {
        System.out.println("--------------------------------------------------------------- Write the " + language + " word. " + "Quit the program by pressing Q ---------------------------------------------------------------");
    }

    public void Run() {
        Dictionary dictionary = new Dictionary();

        setLanguage("english");

        Scanner input = new Scanner(System.in);

        int fullWordPoints = 0;
        int currentWordCounter = 0;
        Spellchecker spellchecker = new Spellchecker();

        for (Map.Entry<String, List<String>> entry : dictionary.words()) {
            currentWordCounter++;

            System.out.println(entry.getKey());
            String inputAnswer = input.nextLine();

            /* If statement down below checks if user's input is equal to the String q.
            If so then -> System.exit(0) = Will terminate program*/
            if (inputAnswer.equals("q")) {
                currentWordCounter++;
                System.out.println("You answered a total of " +
                        currentWordCounter + " words and had " + fullWordPoints + " right. Kind regard!");
                System.exit(0);
            }
            String resultMessage = null;
            float result = spellchecker.spellcheck(inputAnswer, entry.getValue());
            // ULTIMATE SPELLCHECKER MUAHAHAHA
            if (result == 1) {
                fullWordPoints++;
                resultMessage = "Correct! ";
            } else if (result > 0.5) {
                resultMessage = "Almost! ";
            } else {
                resultMessage = "Incorrect! ";
            }
            System.out.println(resultMessage + " " + fullWordPoints + "/" + currentWordCounter);
        }

        System.out.println("You answered a total of " +
                dictionary.getSize() + " words and had " + fullWordPoints + " points. Kind regard!");

    }
}