public class Logik {

    private int tecken = 0;
    private int rader = 0;
    private int ord = 0;
    private String langstaOrd = "";

    public void behandlaRad(String rad) {
        if (rad.equalsIgnoreCase("stop")) {
            return;  // Stoppa om ordet "stop" matas in
        }

        // Räkna tecken i raden
        tecken += rad.length();

        // Dela upp raden i ord och räkna
        String[] ordArray = rad.split("\\s+");
        ord += ordArray.length;

        // Kontrollera för det längsta ordet
        for (String ordStr : ordArray) {
            if (ordStr.length() > langstaOrd.length()) {
                langstaOrd = ordStr;
            }
        }

        // Öka räknaren för rader
        rader++;
    }

    public int getTecken() {
        return tecken;
    }

    public int getRader() {
        return rader;
    }

    public int getOrd() {
        return ord;
    }

    public String getLangstaOrd() {
        return langstaOrd;
    }
}
