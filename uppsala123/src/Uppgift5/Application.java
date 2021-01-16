package Uppgift5;

import A5.Movies;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Application {

    public void Run() {

        Movies movies = new Movies();
        Scanner input = new Scanner(System.in);

        for (Map.Entry<String, List<String>> entry : movies.moviesEntrySet()) {
            String inputAnswer = input.nextLine();
        }
    }
    
}
