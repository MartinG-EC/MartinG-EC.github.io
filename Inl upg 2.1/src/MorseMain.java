import java.util.Scanner;

public class MorseMain {
    public static void main(String[] args) {
        MorseLogik morseLogic = new MorseLogik();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Välj konvertering:");
        System.out.println("1. Morse till Engelska");
        System.out.println("2. Engelska till Morse");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        if (choice == 1) {
            System.out.println("Ange morsekod:");
            String morseCode = scanner.nextLine();
            System.out.println("Resultat: " + morseLogic.morseToEnglish(morseCode));
        } else if (choice == 2) {
            System.out.println("Ange engelsk text:");
            String englishText = scanner.nextLine();
            System.out.println("Resultat: " + morseLogic.englishToMorse(englishText));
        } else {
            System.out.println("Ogiltigt val.");
        }

        scanner.close();
    }
}