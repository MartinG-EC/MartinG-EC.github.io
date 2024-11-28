package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LogikTest1 {

    @Test
    public void testAnalyseraText_EnRad() {
        Logik logik = new Logik();
        String text = "Hej på dig!";
        logik.analyseraText(text);
        assertEquals(11, logik.getTotalTecken());
        // Här kan man sätta upp några förväntade värden och kontrollera om de matchar
    }

    @Test
    public void testAnalyseraText_FleraRader() {
        Logik logik = new Logik();
        String text = "Hej på dig!\nHur mår du?\nStop";
        logik.analyseraText(text);
        assertEquals(3, logik.getAntalRader());
        // Kontrollerar det förväntade resultat baserat på texten
    }

    @Test
    public void testAnalyseraText_StopRad() {
        Logik logik = new Logik();
        String text = "Den här raden ska inte räknas med.\nstop";
        logik.analyseraText(text);
        assertEquals(1, logik.getAntalRader());
        // Testar så att raden "stop" inte räknas med i antal rader
    }

    @Test
    public void testAnalyseraText_EmptyText() {
        Logik logik = new Logik();
        String text = "långt ord, längre ord, längsta ordet";
        logik.analyseraText(text);
        assertEquals("längsta",logik.getLangstaOrd());
        // Testar vilket ord som är längst och om det blir rätt
    }
}