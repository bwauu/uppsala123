package Fak;
/*
 * A class where Map "dictionary" is declared as a instance variable and used in methods.
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class FileDatabaseFive {

    /* instance variable declaration */
    Map<String, String> movies;

    final static String filePath = "C:\\Users\\wiapp\\IdeaProjects\\uppsala123\\src\\A5\\MovieSet.txt";
    //read text file to HashMap



    public static Map<String, String> getHashMapFromTextFile() {

        Map<String, String> movies = new LinkedHashMap<String, String>();
        BufferedReader br = null;
        movies.entrySet();

        try {

            //create file object
            File file = new File(filePath);

            //create BufferedReader object from the File
            br = new BufferedReader(new FileReader(file));

            String line = null;

            //read file line by line
            while ((line = br.readLine()) != null) {

                //split the line by :
                String[] parts = line.split(";");

                //first part is name, second is age
                String title = parts[0].trim();
                String age = parts[1].trim();
                String ratingScore = age.toString();

                //put name, age in HashMap if they are not empty
                if (!title.equals("") && !ratingScore.equals(""))
                    movies.put(title, ratingScore);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            //Always close the BufferedReader
            if (br != null) {
                try {
                    br.close();
                } catch (Exception e) {
                    System.out.println("Opsie");
                }
                ;
            }
        }

        return movies;

    }


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


    public FileDatabaseFive() {
        this.movies = new LinkedHashMap<>();
        this.movies = getHashMapFromTextFile();

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
