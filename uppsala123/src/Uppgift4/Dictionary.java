package Uppgift4;

import java.util.List;
import java.util.Map;

public class Dictionary {


    private Map<String, List<String>> dictionary;

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
    public Dictionary(Map<String, List<String>> dictionary) {

        this.dictionary = dictionary;

        /*
        * Here you  */
        dictionary.put("hej", List.of("hi", "hello"));
        dictionary.put("hus", List.of("house"));
        dictionary.put("springa", List.of("run"));
        dictionary.put("blå", List.of("blue"));
        dictionary.put("baka", List.of("bake"));
        dictionary.put("hoppa", List.of("jump"));
        dictionary.put("simma", List.of("swim"));
        dictionary.put("måne", List.of("moon"));
        dictionary.put("väg", List.of("road"));
        dictionary.put("snäll", List.of("kind", "sweet"));
    }

}
