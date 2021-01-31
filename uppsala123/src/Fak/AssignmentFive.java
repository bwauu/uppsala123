package Fak;

import A5.MovieDatabaseUI;

import java.io.File;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;


import static Fak.FileDatabaseFive.getHashMapFromTextFile;

/**
 * Entry point for a movie database as part of an assignment 
 * in the course Introduction to Programming with Java.
 */
public class AssignmentFive {
	/**
	 * Program entry point. Starts the movie database UI.
	 * 
	 * @param args not used
	 */
	public static void main(String[] args)  {
		//Construct and start the UI
		new MovieDatabaseUI().startUI();
		//read text file to HashMap
		Map<String, String> moviesPartTwo = getHashMapFromTextFile();

		//iterate over HashMap entries
		for(Map.Entry<String, String> entry : moviesPartTwo.entrySet()){
			System.out.println( entry.getKey() + " => " + entry.getValue() );
		}
	}
}