package Uppgift4;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;


public class Application {

    public void Run() {

        Map<String, List<String>> map = new LinkedHashMap<>();
        map.put("bil", List.of("car"));
        map.put("hus", List.of("house"));
        map.put("springa", List.of("run"));
        map.put("blå", List.of("blue"));
        map.put("baka", List.of("bake"));
        map.put("hoppa", List.of("jump"));
        map.put("simma", List.of("swim"));
        map.put("måne", List.of("moon"));
        map.put("väg", List.of("road"));
        map.put("snäll", List.of("kind", "sweet"));
        Dictionary dictionary = new Dictionary(map);

        Scanner input = new Scanner(System.in);
        /*
        Visa ord för användare. check
        Läs in svar.

        Tolka correct eller fel svar och printa result
        done

         */


        map.forEach((key, answers) -> {
            /*
            System.out.println(key) will print out the current key of map.
            This print will be iterated through whole map.
            */
            System.out.println(key);
            /*

             */
            String inputAnswer = input.nextLine();
            Iterator it = map.entrySet().iterator();


            String stringKey = key.toString();




            /* If statement down below checks if user's input is equal to the String q.
            If so then -> System.exit(0) = Will terminate program*/
            if (inputAnswer.equals("q")) {
                System.exit(0);
            }
            answers.forEach(a -> {
                int inputStringLength = inputAnswer.length();
                int letterPointsCounter = 0;
                int rightStringLength = a.length();
//                if (compare user's answer to correct answer)
                if (inputAnswer.length() > 0) {
                    String currentRightWord = a;

                    for (int i = 0; i < inputAnswer.length(); i++) {

                        if (inputAnswer.toLowerCase().equals(currentRightWord)) {
                        System.out.println("correct answer!");
                            System.out.println(a);
                        break;
                    }

                        if(inputAnswer.substring(i).equalsIgnoreCase(a.substring(i))){
                            letterPointsCounter++;
                            if (inputStringLength >= rightStringLength * 0.5) {
                                System.out.println("Close! You got " + rightStringLength/letterPointsCounter + "% right");
                            }
                        }

                    }


                }
            });
        });


    }
}