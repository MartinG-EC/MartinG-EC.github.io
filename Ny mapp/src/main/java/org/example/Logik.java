package org.example;

public class Logik {

    public void analyseraText(String text) {
        String[] lines = text.split("\n");
        int totalTecken = 0;
        int totalOrd = 0;
        int antalRader = 0;
        String langstaOrd = "";

        for (String line : lines) {
            if (line.equalsIgnoreCase("stop")) {
                break;
            }

            antalRader++;
            totalTecken += line.length();

            String[] ord = line.split("\\s+");
            totalOrd += ord.length;

            for (String ordText : ord) {
                if (ordText.length() > langstaOrd.length()) {
                    langstaOrd = ordText;
                }
            }
        }

        // Skriv ut resultaten
        System.out.println("Totalt antal tecken: " + totalTecken);
        System.out.println("Totalt antal ord: " + totalOrd);
        System.out.println("Totalt antal rader: " + antalRader);
        System.out.println("Längsta ordet: " + langstaOrd);
    }
}
