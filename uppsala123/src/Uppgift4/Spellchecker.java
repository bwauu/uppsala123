package Uppgift4;

public class Spellchecker {
    // float will make it easier to interpret correctness.
    // if would be lo
    public float spellcheck(String word, String correctWord) {
        if (correctWord == null || correctWord.isEmpty() || word == null) {
            return 0;
        }
        if (word.toLowerCase().equals(correctWord)) {
            return 1;
        }
        float matchingChars = 0;
        for (int i = 0; i < correctWord.length(); i++) {
            for (int j = 0; j < word.length(); j++) {
                if (correctWord.charAt(i) == word.charAt(j)) {
                    matchingChars++;
                }
            }
        }
        return matchingChars / correctWord.length();
    }

}
