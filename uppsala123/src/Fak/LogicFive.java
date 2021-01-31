package Fak;
/**
 * This Spellchecker.java class contains methods that stands for the logical interpretation of correctness of word.
 *
 */

import java.util.List;

public class LogicFive {




    /**
     *
     * @param word refers to user's input as a String
     * @param correctWord refers to List of values in map.
     * @return a float between 0 and 1 of correctness
     */
    public StringBuilder spellcheck(String word, String correctWord) {
        if (correctWord == null || word == null) {
            return null;
        }
        word = word.toLowerCase();
        correctWord = correctWord.toLowerCase();
        int shortestWordLength = 0;
        int longestWordLength = 0;
        if (word.length() < correctWord.length()) {
            shortestWordLength = word.length();
            longestWordLength = correctWord.length();
        } else {
            shortestWordLength = correctWord.length();
            longestWordLength = word.length();
        }
        StringBuilder matchingChars = new StringBuilder();
        for (int i = 0; i < shortestWordLength; i++) {
            if (word.charAt(i) == correctWord.charAt(i)) {
                matchingChars.append(i);
            }
        }
        return matchingChars;
    }

}
