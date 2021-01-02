package Uppgift4;


import java.util.List;


public class Spellchecker {
    // float will make it easier to interpret correctness.
    // if would be lo

    /**
     *
     * @param word input String from user
     * @param correctWords refers to List of strings that are correct key translation
     * @return return bestresult
     */
    public float spellcheck(String word, List<String> correctWords) {
        float bestResult = 0;
        // ULTIMATE SPELLCHECKER MUAHAHAHA
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
     * @param correctWord dictionary entrySet value
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
