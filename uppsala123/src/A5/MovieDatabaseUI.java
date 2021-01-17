package A5;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

/**
 * A command line user interface for a movie database.
 */
public class MovieDatabaseUI {
    private Scanner _scanner;
    private final FileDatabase moviesDatabase = new FileDatabase();

    /**
     * Construct a MovieDatabaseUI.
     */
    public MovieDatabaseUI() {
        moviesDatabase.fileDatabase();
        addMovie();


    }

    /**
     * Start the movie database UI.
     */
    public void startUI() {


        _scanner = new Scanner(System.in);
        int input;
        boolean quit = false;

        System.out.println("** FILMDATABAS **");

        while (!quit) {
            input = getNumberInput(_scanner, 1, 4, getMainMenu());

            switch (input) {
                case 1:
                    searchTitel();
                    break;
                case 2:
                    searchReviewScore();
                    break;
                case 3:
                    addMovie();
                    break;
                case 4:
                    quit = true;
            }
        }
        //Close scanner to free resources
        _scanner.close();
    }

    /**
     * Get input and translate it to a valid number.
     *
     * @param scanner the Scanner we use to get input
     * @param min     the lowest correct number
     * @param max     the highest correct number
     * @param message message to user
     * @return the chosen menu number
     */
    private int getNumberInput(Scanner scanner, int min, int max, String message) {
        int input = -1;

        while (input < 0) {
            System.out.println(message);
            try {
                input = Integer.parseInt(scanner.nextLine().trim());
            } catch (NumberFormatException nfe) {
                input = -1;
            }
            if (input < min || input > max) {
                System.out.println("Ogiltigt värde.");
            }
        }
        return input;
    }

    Logic logicSearcher = new Logic();

    /**
     * Get search string from user, search title in the movie
     * database and present the search result.
     */
    private void searchTitel() {
        System.out.print("Ange sökord: ");
        String title = _scanner.nextLine().trim();


        //TODO: Add call to search movie database based on input
        for (Map.Entry<String, String> entry : moviesDatabase.moviesEntrySet()) {
            String currentMovieTitle = entry.getKey().toLowerCase();


            StringBuilder result = logicSearcher.spellcheck(title, entry.getKey());
            if (currentMovieTitle.contains(title.toLowerCase())) {
                System.out.println(entry.getKey());
            }

        }


        //TODO: Present results to user

    }

    /**
     * Get search string from user, search review score in the movie
     * database and present the search result.
     */
    private void searchReviewScore() {
        int review = getNumberInput(_scanner, 1, 5, "Ange minimibetyg (1 - 5): ");
        String reviewStringed = String.valueOf(review);
        List myList = new ArrayList();
        //TODO: Add call to search movie database based on input
        for (Map.Entry<String, String> entry : moviesDatabase.moviesEntrySet()) {
            String dumbRatingSystem = entry.getValue();

            char ratingAsChar = dumbRatingSystem.charAt(0);

            int currentRatingInMoviesDB = Character.getNumericValue(ratingAsChar);

            if (currentRatingInMoviesDB == review) {
                System.out.println("Titel: " + entry.getKey() + " Betyg: " + entry.getValue());

            }

        }
        //TODO: Present results to user

    }

    /**
     * Get information from user on the new movie and add
     * it to the database.
     */
    private void addMovie() {
        System.out.print("Titel: ");
        String title = _scanner.nextLine().trim();
        int reviewScore = getNumberInput(_scanner, 1, 5, "Betyg (1 - 5): ");
        String reviewScoreStringed = String.valueOf(reviewScore);
        String realScoreIPromiseLawl = reviewScoreStringed.concat("/5");
        moviesDatabase.movies.put(title,realScoreIPromiseLawl);


        //TODO: Add call to add movie into database

    }

    /**
     * Return the main menu text.
     *
     * @return the main menu text
     */
    private String getMainMenu() {
        return "-------------------\n" +
                "1. Sök på titel\n" +
                "2. Sök på betyg\n" +
                "3. Lägg till film\n" +
                "-------------------\n" +
                "4. Avsluta";
    }
}