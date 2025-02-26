import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MorseLogikTest {
    private final MorseLogik morseLogic = new MorseLogik();

    @Test
    public void testMorseToEnglish() {
        assertEquals("HEJ", morseLogic.morseToEnglish(".... . .---"));
        assertEquals("HELLOWORLD", morseLogic.morseToEnglish(".... . .-.. .-.. --- .-- --- .-. .-.. -.."));
    }
    //Testar att morsekod korrekt konverteras till engelska.

    @Test
    public void testEnglishToMorse() {
        assertEquals(".... . .---", morseLogic.englishToMorse("HEJ"));
        assertEquals(".... . .-.. .-.. --- .-- --- .-. .-.. -..", morseLogic.englishToMorse("HELLOWORLD"));
    }
    //Testar att engelsk text korrekt konverteras till morsekod.

    @Test
    public void testInvalidCharacters() {
        assertEquals("Inte bra", morseLogic.morseToEnglish(".... ! .---"));
        assertEquals("Inte bra", morseLogic.englishToMorse("HEJ!"));
    }
    //Testar felhantering för ogiltiga tecken.

    @Test
    public void testNumbers() {
        assertEquals("Kan inte användas här", morseLogic.morseToEnglish(".... 1 .---"));
        assertEquals("Kan inte användas här", morseLogic.englishToMorse("HEJ1"));
    }
    //Testar felhantering för siffror.

    @Test
    public void testEmptyInput() {
        assertEquals("", morseLogic.morseToEnglish(""));
        assertEquals("", morseLogic.englishToMorse(""));
    }
    //Testar hantering av tom inmatning.
}