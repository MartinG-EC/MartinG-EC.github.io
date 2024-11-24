package org.example;

import org.example.Logik;
import org.testng.annotations.Test;
import static org.junit.jupiter.api.Assertions.*;

 class LogikTest {

    @Test
    public void testAnalyseraText_EnRad() {
        Logik logik = new Logik();
        String text = "Hej på dig!";
        logik.analyseraText(text);
        // Här kan man sätta upp några förväntade värden och kontrollera om de matchar
    }

    @Test
    public void testAnalyseraText_FleraRader() {
        Logik logik = new Logik();
        String text = "Hej på dig!\nHur mår du?\nStop";
        logik.analyseraText(text);
        // Kontrollerar det förväntade resultat baserat på texten
    }

    @Test
    public void testAnalyseraText_StopRad() {
        Logik logik = new Logik();
        String text = "Den här raden ska inte räknas med.\nstop";
        logik.analyseraText(text);
        // Testar så att raden "stop" inte räknas med i antal rader
    }

    @Test
    public void testAnalyseraText_EmptyText() {
        Logik logik = new Logik();
        String text = "";
        logik.analyseraText(text);
        // Testar vad som händer om texten är tom (kan vara noll eller tom sträng)
    }
}