package org.example;

public class Logik {
    private int totalTecken = 0;
    private int totalOrd = 0;
    private int antalRader = 0;
    private String langstaOrd = "";

    public void analyseraText(String text) {
        String[] lines = text.split("\n");

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
    }
    public int getTotalTecken() {
        return totalTecken;
    }

    public int getTotalOrd() {
        return totalOrd;
    }

    public int getAntalRader() {
        return antalRader;
    }

    public String getLangstaOrd() {
        return langstaOrd;
    }
}


