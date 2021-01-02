package Uppgift4;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;


public class Application {


    static void setLanguage(String language) {

        System.out.println("--------------------------------------------------------------- Write the " + language + " word. " + "Quit the program by pressing Q ---------------------------------------------------------------");
    }


    public void Run() {
        Dictionary dictionary = new Dictionary();
        // TODO 1. Let user know his/her points regarding the total words answered
        // TODO 2. Fix secondary word for snäll
        // TODO 3. Correct answer is (a)

        setLanguage("english");

        Scanner input = new Scanner(System.in);

        int fullWordPoints = 0;
        int currentWordCounter = 0;
        String resultMessage;
        Spellchecker spellchecker = new Spellchecker();


        for (Map.Entry<String, List<String>> entry : dictionary.words()) {
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
            // ULTIMATE SPELLCHECKER MUAHAHAHA
            for (String correctAnswer : entry.getValue()) {
                float result = spellchecker.spellcheck(inputAnswer, correctAnswer);
                if (correctAnswer.equalsIgnoreCase(inputAnswer)) {
                    currentWordCounter++;
                    fullWordPoints++;

                    resultMessage = "Correct! " + fullWordPoints + "/" + currentWordCounter;

                } else if (result > 0.5 ) {
                    currentWordCounter++;
                    resultMessage = "Almost!";
                }
                else {
                    currentWordCounter++;
                    resultMessage = "Incorrect!";
                }
                System.out.println(resultMessage);
            }
        }

        System.out.println("You answered a total of " +
                dictionary.getSize() + " words and had " + fullWordPoints + " points. Kind regard!");

    }
}