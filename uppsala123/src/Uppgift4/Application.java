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
            String answer = input.nextLine();
            Iterator it = map.entrySet().iterator();

                List<String> keys = map.get(key);
            String correctAnswerStringed = keys.toString();


            System.out.println(correctAnswerStringed.length());

            /* If statement down below checks if user's input is equal to the String q.
            If so then -> System.exit(0) = Will terminate program*/
            if (answer.equals("q")) {
                System.exit(0);
            }
            answers.forEach(a -> {
                int letterPointsCounter = 0;
//                if (compare user's answer to correct answer)
                for(int i = 0; i < answer.length(); i++) {

                    if (answer.substring(i).equals(correctAnswerStringed.substring(i))) {
                        i++;
                        letterPointsCounter++;
                    }
                    if(correctAnswerStringed.length() == key.length()) {
                        System.out.println("Correct Answer!");
                    }
                }

            });
        });



    }
}