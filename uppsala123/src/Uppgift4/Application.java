package Uppgift4;

import com.sun.jdi.Value;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;


public class Application {


    static void setLanguage(String language) {

        System.out.println("--------------------------------------------------------------- Write the " + language + " word. " + "Quit the program by pressing Q ---------------------------------------------------------------");
    }


    public void Run() {
        int cwc = 0;
        Map<String, List<String>> map = new LinkedHashMap<>();
        Dictionary dictionary = new Dictionary(map);


        // TODO 1. Let user know his/her points regarding the total words answered
        // TODO 2. Fix secondary word for snäll
        // TODO 3. Correct answer is (a)


        setLanguage("english");
        /*
                                    Dictionary explanation map.put(K key, V value);
         1. The variable K references the key in map.
         2. The variable  V references the value of the key in map.
         To add words to dictionary:
            Use the map.put() method to add in words = (to be translated) = key
             and translated words = (answers) = values
             map.put("vän", List.of("friend"))
             where "vän" is the word to be translated and List.of("friend") is the translation.
             The List.of methods is used to allow multiple values in key. This means that you can allow other synonyms
             to the word to be translated
             e.i.
                    map.put("Hej", List.of("Hi","Hello"));

         */

        map.entrySet();







        map.forEach((words, answers) -> {

            /*
            1. The variable "words" references the keys in map.
            2. The varible "answers" references the value of the key.
            3. Summary:
            map.forEach will iterate through each element in the entire Map.
            */

            /*
            Start of map.forEach(words, answers) the console will print out the current word of the iteration.
             */
            System.out.println(words);
            /*
            currentWordCounter is incrementing each iteration
             */

            int totalSynonyms = answers.size();

            if (totalSynonyms > 1){
                Scanner input = new Scanner(System.in);
                String inputAnswer = input.nextLine();
                for ( List<String> value : map.values() ) {
                }

                String answersStringed = answers.toString();
                for(int i = 0; i < totalSynonyms; i++) {
                    if(answers.get(i).equalsIgnoreCase(inputAnswer)) {
                        System.out.println("Correct");
                    }
                }
            }
            /* If statement down below checks if user's input is equal to the String q.
            If so then -> System.exit(0) = Will terminate program*/
            else {
                spellchecker(answers);
            }

        });


    }

    public static void SynonymSpellchecker(Map.Entry<String, String> entry) {

    }
    public static void spellchecker(List<String> answers)  {
        Scanner input = new Scanner(System.in);
        String inputAnswer = input.nextLine();


        AtomicInteger currentWordCounter = new AtomicInteger();
        currentWordCounter.getAndIncrement();
        AtomicInteger fullWordPoints = new AtomicInteger();

        answers.forEach(a -> {

            if (inputAnswer.equals("q")) {
                currentWordCounter.getAndDecrement();
                System.out.println("You answered a total of " +
                        currentWordCounter + " words and had " + fullWordPoints + " right. Kind regard!");
                System.exit(0);
            }


                /* TODO 1
                Iteration through each for 1 time.
                if inputAnswer == 1 out of 2 synonyms, then sout correct! + getAndDecrement
                 */

            if (inputAnswer.toLowerCase().equals(a)) {
                fullWordPoints.getAndIncrement();
                System.out.println("Correct! " + fullWordPoints + " right out of " + currentWordCounter + " words.");

            } else if (inputAnswer.length() == a.length()) {
                    /* TODO 2
                    If inputAnswer have a majority of letters in index places of a
                    Then sout Almost right!
                    */
                int majority = 0;
                for (int i = 0; i < a.length(); i++) {
                    for (int j = 0; j < a.length(); j++) {
                        if (a.charAt(i) == inputAnswer.charAt(j)) {
                            majority++;
                        }
                    }
                }
                if (majority >= a.length() * 0.5) {
                    System.out.println("Almost correct.");

                }


            }  else {
                System.out.println("Incorrect answer!");
            }

        });

    }
}