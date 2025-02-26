import java.util.HashMap;
import java.util.Map;

public class MorseLogik {
    private static final Map<String, String> morseToEnglish = new HashMap<>();
    private static final Map<String, String> englishToMorse = new HashMap<>();

    static {
        morseToEnglish.put(".-", "A");
        morseToEnglish.put("-...", "B");
        morseToEnglish.put("-.-.", "C");
        morseToEnglish.put("-..", "D");
        morseToEnglish.put(".", "E");
        morseToEnglish.put("..-.", "F");
        morseToEnglish.put("--.", "G");
        morseToEnglish.put("....", "H");
        morseToEnglish.put("..", "I");
        morseToEnglish.put(".---", "J");
        morseToEnglish.put("-.-", "K");
        morseToEnglish.put(".-..", "L");
        morseToEnglish.put("--", "M");
        morseToEnglish.put("-.", "N");
        morseToEnglish.put("---", "O");
        morseToEnglish.put(".--.", "P");
        morseToEnglish.put("--.-", "Q");
        morseToEnglish.put(".-.", "R");
        morseToEnglish.put("...", "S");
        morseToEnglish.put("-", "T");
        morseToEnglish.put("..-", "U");
        morseToEnglish.put("...-", "V");
        morseToEnglish.put(".--", "W");
        morseToEnglish.put("-..-", "X");
        morseToEnglish.put("-.--", "Y");
        morseToEnglish.put("--..", "Z");

        for (Map.Entry<String, String> entry : morseToEnglish.entrySet()) {
            englishToMorse.put(entry.getValue(), entry.getKey());
        }
    }

    public String morseToEnglish(String morseCode) {
        if (morseCode.matches(".*[0-9].*")) {
            return "Kan inte använda nummer.";
        }
        if (morseCode.matches(".*[!,#¤%&()=?].*")) {
            return "Kan inte använda det tecken.";
        }

        StringBuilder result = new StringBuilder();
        String[] words = morseCode.split(" ");
        for (String word : words) {
            result.append(morseToEnglish.getOrDefault(word, ""));
        }
        return result.toString();
    }

    public String englishToMorse(String englishText) {
        if (englishText.matches(".*[0-9].*")) {
            return "Kan inte användas här";
        }
        if (englishText.matches(".*[!,#¤%&/()=?].*")) {
            return "Inte bra";
        }

        StringBuilder result = new StringBuilder();
        for (char c : englishText.toUpperCase().toCharArray()) {
            result.append(englishToMorse.getOrDefault(String.valueOf(c), "")).append(" ");
        }
        return result.toString().trim();
    }
}
