package InledandeJavaProgrammeringKurs.A5;
/*
 * A class where Map "movies" is declared as a instance variable and used in methods different methods
 *
 * @author Benjamin Appelberg
 * @version 1.0
 *
 */

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;


public class FileDatabase {

    /* instance variable declaration */
    Map<String, String> movies;

    /**
     * A method that creates path to file of stored movies and reads each line in txt file
     */
    public void fileDatabase() {
        //sökväg till filen text.txt i samma katalog som projektet, dvs en nivå ovan src
        Path path = Paths.get("uppsala123\\src\\InledandeJavaProgrammeringKurs.A5\\MovieSet.txt");

        try {
            //om filen inte finns så skapar vi den
            if (!Files.exists(path)) {
                Files.createFile(path);
            }
            List<String> lines = new ArrayList<>();
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
            // catch exception and sout String.
        } catch (IOException e) {
            System.out.println("Oops! Something went wrong!");
            e.printStackTrace();
        }
    }

    /**
     *  FileDatabase will call new LinkedHashMap to this.movies
     */
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