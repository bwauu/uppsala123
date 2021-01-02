package Uppgift4;

import java.util.*;

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

    public Dictionary() {
        this.dictionary = new LinkedHashMap<>();
        dictionary.put("bil", List.of("car", "runcarsnowpen"));
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

    /**
     *
     * @return applied entrySet() method on this.dictionary
     */
    public Set<Map.Entry<String, List<String>>> words() {

        return this.dictionary.entrySet();
    }

    /**
     *
     * @return size of dictionary map as an int.
     */
    public int getSize() {


       return this.dictionary.size();
    }
}
