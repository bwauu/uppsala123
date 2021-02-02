package InledandeJavaProgrammeringKurs.Uppgift4;


import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * Application is responsible for the UI of this program.
 */

public class Application {
    /**
     *
     * @param language refers to the language to exercise as a String.
     */
    static void setLanguage(String language) {
        System.out.println("--------------------------------------------------------------- Write the " + language + " word. " + "Quit the program by pressing Q ---------------------------------------------------------------");
    }

    /**
     * Application start!
     */
    public void Run() {

        /* Invoke dictionary constructor  */
        Dictionary dictionary = new Dictionary();
        setLanguage("english");
        /* new = invoke constructor */
        Scanner input = new Scanner(System.in);

        int fullWordPoints = 0;
        int currentWordCounter = 0;
        Spellchecker spellchecker = new Spellchecker();

        for (Map.Entry<String, List<String>> entry : dictionary.words()) {
            currentWordCounter++;

            System.out.println(entry.getValue());
            String inputAnswer = input.nextLine();

            /*
            If statement down below checks if user's input is equal to the String q.
            If so it will print calculate how many words user have
            answered, calculate the total amount of correct words and atlas -> System.exit(0) = Will terminate program
            */
            if (inputAnswer.equals("q")) {
                currentWordCounter++;
                System.out.println("You answered a total of " +
                        currentWordCounter + " words and had " + fullWordPoints + " right. Kind regard!");
                System.exit(0);
            }
            // Declared String variable "resultMessage"  will vary by the spellcheck methods results.
            String resultMessage = null;
            float result = spellchecker.spellcheck(inputAnswer, entry.getValue());
            // ULTIMATE SPELLCHECKER MUAHAHAHA
            // Logical if else if clauses.
            if (result == 1) {
                fullWordPoints++;
                resultMessage = "Correct! ";
            } else if (result > 0.5) {
                resultMessage = "Almost! ";
            } else {
                resultMessage = "Incorrect! ";
            }
            // Each input (if not q nor end of dictionary) will print line down below here.
            System.out.println(resultMessage + " " + fullWordPoints + "/" + currentWordCounter);
        }
        /*
        If users reach ending of dictionary, console will log concatenated String with the dictionary's size
        and user's total collected points.
        */
        System.out.println("You answered a total of " +
                dictionary.getSize() + " words and had " + fullWordPoints + " points. Kind regard!");

    }
}