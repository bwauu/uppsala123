package Uppgift4;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;


public class Test {

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

        AtomicInteger fullWordPoints = new AtomicInteger();
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
                String currentRightWord = a;
                int rightStringLength = a.length();
//                if (compare user's answer to correct answer)


                if (inputAnswer.toLowerCase().equals(currentRightWord)) {
                    fullWordPoints.getAndIncrement();
                    System.out.println("Correct! " + fullWordPoints + "/" + map.size());

                } else if (true) {
                    int majority = 0;
                    for (int i = 0; i < a.length(); i++) {
                        for (int j = 0; j < a.length(); j++) {
                            if (currentRightWord.charAt(i) == inputAnswer.charAt(j)) {
                                majority++;
                            }
                        }
                    }
                    if (majority > rightStringLength * 0.5) {
                        System.out.println("Almost correct.");
                    }
                } else {
                    System.out.println("Sorry, wrong answer!");

                }


            });
        });


    }
}