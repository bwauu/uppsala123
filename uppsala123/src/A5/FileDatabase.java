package A5;
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

public class FileDatabase {

    /* instance variable declaration */
    Map<String, String> movies;

    final static String filePath = "C:\\Users\\wiapp\\IdeaProjects\\uppsala123\\src\\A5\\MovieSet.txt";
    //read text file to HashMap
    Map<String, Integer> mapFromFile = getHashMapFromTextFile();

    //iterate over HashMap entries
        for(Map.Entry<String, Integer> entry : mapFromFile.entrySet()){
        System.out.println( entry.getKey() + " => " + entry.getValue() );
    }
    public static Map<String, Integer> getHashMapFromTextFile(){

        Map<String, Integer> mapFileContents = new LinkedHashMap<String, Integer>();
        BufferedReader br = null;

        try{

            //create file object
            File file = new File(filePath);

            //create BufferedReader object from the File
            br = new BufferedReader( new FileReader(file) );

            String line = null;

            //read file line by line
            while ( (line = br.readLine()) != null ){

                //split the line by :
                String[] parts = line.split(";");

                //first part is name, second is age
                String name = parts[0].trim();
                Integer age = Integer.parseInt( parts[1].trim() );

                //put name, age in HashMap if they are not empty
                if( !name.equals("") && !age.equals("") )
                    mapFileContents.put(name, age);
            }

        }catch(Exception e){
            e.printStackTrace();
        }finally{

            //Always close the BufferedReader
            if(br != null){
                try {
                    br.close();
                }catch(Exception e){};
            }
        }

        return mapFileContents;

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
    public void fileDatabase() {
        // Read File
        // Parse each line

        Path path = Paths.get("MovieSet.txt");
        try {
            //om filen inte finns så skapar vi den
            if (!Files.exists(path)) {
                Files.createFile(path);
            }

            //läser in hela filen
            List<String> allLines = Files.readAllLines(path);

            //läser in hela filen
            List<String> lines = new ArrayList<String>();
            //ersätter innehållet i filen med det uppdaterade (där vi adderar tre nya rader)
            //Files.write(path, lines);
            
            //skriver ut innehållet
            /*
            for (String line : allLines) {
                String[] tokens = line.split(";");
                String lastCut = tokens[tokens.length - 1];
                // TODO: Checkout split().
                lines.add(lastCut);
            }
            System.out.println(lines);
            */
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
