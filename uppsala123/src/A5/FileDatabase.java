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


            //skriver ut innehållet

            for (String line : allLines) {

                String[] parts = line.split(";");
                String part1 = parts[0];
                String part2 = parts[1];

                lines.add(line);
                movies.put(part1, part2);
                Files.write(path, lines);
            }


        } catch (IOException e) {
            System.out.println("Oops! Something went wrong!");
            e.printStackTrace();
        }
    }


    public FileDatabase() {
        this.movies = new LinkedHashMap<>();


    }

    /**
     * @return entrySet() method on this.dictionary
     */
    public Set<Map.Entry<String, String>> moviesEntrySet() {
        return this.movies.entrySet();

    }

}
