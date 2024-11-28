import org.example.Logik;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder inputText = new StringBuilder();

        System.out.println("Skriv in text och skriv 'stop' för att avsluta:");

        while (true) {
            String line = scanner.nextLine();
            if (line.equalsIgnoreCase("stop")) {
                break;
            }
            inputText.append(line).append("\n");
        }

        Logik logik = new Logik();
        logik.analyseraText(inputText.toString());


        System.out.println("Antal tecken: " + logik.getTotalTecken());
        System.out.println("Antal ord: " + logik.getTotalOrd());
        System.out.println("Antal rader: " + logik.getAntalRader());
        System.out.println("Längsta ordet" + logik.getLangstaOrd());
        System.out.println("Text skriven:");
        System.out.println(inputText);
    }
}
