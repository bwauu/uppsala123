package A5;
/*
 * A class where Map "dictionary" is declared as a instance variable and used in methods.
 */

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Movies {

    /* instance variable declaration */
    Map<String, List<String>> movies;

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


    public Movies() {
        this.movies = new LinkedHashMap<>();
        movies.put("Terminator 2 - Domedagen", List.of("4/5"));
        movies.put("Nyckeln till frihet", List.of("4/5"));
        movies.put("Pulp fiction", List.of("4/5"));
        movies.put("Fight club", List.of("4/5"));
        movies.put("Matrix", List.of("5/5"));
        movies.put("När lammen tysnar", List.of("4/5"));
        movies.put("De misstänkta", List.of("5/5"));
        movies.put("American History X", List.of("4/5"));
        movies.put("Gladiator", List.of("4/5"));
    }

    /**
     *
     * @return entrySet() method on this.dictionary
     */
    public Set<Map.Entry<String, List<String>>> moviesEntrySet() {
        return this.movies.entrySet();
    }


    /**
     *
     * @return size of dictionary map as an int.
     */
    public int getSize() {
       return this.movies.size();
    }
}
