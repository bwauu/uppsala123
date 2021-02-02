package RunAppInPSVM;

import InledandeJavaProgrammeringKurs.A5.FileDatabase;

import java.util.Map;
import java.util.Scanner;

public class Application {

    public void Run() {

        FileDatabase movies = new FileDatabase();
        Scanner input = new Scanner(System.in);

        for (Map.Entry<String, String> entry : movies.moviesEntrySet()) {
            String inputAnswer = input.nextLine();
        }
    }
    
}
