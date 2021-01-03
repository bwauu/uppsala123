package Uppgift4;
/**
 * This Spellchecker.java class contains methods that stands for the logical interpretation of correctness of word.
 *
 */

import java.util.List;


public class Spellchecker {

    /**
     *String, List<String>
     * @param word refers to user's input as a String
     * @param correctWords refers to List of values in map.
     * @return float as user's best result.
     */
    public float spellcheck(String word, List<String> correctWords) {
        float bestResult = 0;

        for (String correctAnswer : correctWords) {
            float result = spellcheck(word, correctAnswer);
            if (result > bestResult) {
                bestResult = result;
            }
        }
        return bestResult;
    }

    /**
     *
     * @param word refers to user's input as a String
     * @param correctWord refers to List of values in map.
     * @return a float between 0 and 1 of correctness
     */
    public float spellcheck(String word, String correctWord) {
        if (correctWord == null || word == null) {
            return 0;
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
        float matchingChars = 0;
        for (int i = 0; i < shortestWordLength; i++) {
            if (word.charAt(i) == correctWord.charAt(i)) {
                matchingChars++;
            }
        }
        return matchingChars / longestWordLength;
    }

}
