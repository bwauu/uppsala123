package A5;
/*
 * A class where Map "dictionary" is declared as a instance variable and used in methods.
 */

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class FileDatabase {

    /* instance variable declaration */
    Map<String, String> movies;

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


     TODO:
     * Google:
     ** How to parse txt file in Java?
     ** How to parse comma separated lines in Java?
     ** How to add lines to a file in Java?
     * Initiera databasen i konstruktorn
     * Skapa publik metod för att lägga till värden i databasen.
     * Kolla på läroexemplena för:
     ** Läsa in fil.
     ** Spara ned nya rader till fil.
 */
    //sökväg till filen text.txt i samma katalog som projektet, dvs en nivå ovan src
    public void fileDatabase() {
        //läser in hela filen
        Path path = Paths.get("uppsala123\\src\\A5\\MovieSet.txt");


        //läser in hela filen

        //ersätter innehållet i filen med det uppdaterade (där vi adderar tre nya rader)
        // Read File
        // Parse each line

        try {
            //om filen inte finns så skapar vi den
            if (!Files.exists(path)) {
                Files.createFile(path);
            }
            List<String> lines = new ArrayList<String>();
            List<String> allLines = Files.readAllLines(path);



            Files.write(path, lines);

            //skriver ut innehållet

            for (String line : allLines) {
                String[] tokens = line.split(";",1);
                String lastCut = tokens[tokens.length - 1];
                // TODO: Checkout split().
                lines.add(line);
                movies.put(lastCut, lastCut.substring(0, lines.lastIndexOf(line)));
            }



        } catch (IOException e) {
            System.out.println("Oops! Something went wrong!");
            e.printStackTrace();
        }
    }


    public FileDatabase() {
        this.movies = new LinkedHashMap<>();

        /*
        movies.put("Terminator 2 - Domedagen", "4/5");
        movies.put("Nyckeln till frihet", "4/5");
        movies.put("Pulp fiction", "4/5");
        movies.put("Fight club", "4/5");
        movies.put("Matrix", "5/5");
        movies.put("När lammen tysnar", "4/5");
        movies.put("De misstänkta", "5/5");
        movies.put("American History X", "4/5");
        movies.put("Gladiator", "4/5");

         */
    }

    /**
     * @return entrySet() method on this.dictionary
     */
    public Set<Map.Entry<String, String>> moviesEntrySet() {
        return this.movies.entrySet();

    }


    /**
     * @return size of dictionary map as an int.
     */
    public int getSize() {
        return this.movies.size();
    }
}
