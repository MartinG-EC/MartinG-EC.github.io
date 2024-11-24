import java.util.Scanner;

        class Main {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                Logik logik = new Logik();

                System.out.println("Skriv text. Skriv 'stop' för att avsluta.");

                while (true) {
                    String rad = scanner.nextLine();

                    if (rad.equalsIgnoreCase("stop")) {
                        break;
                    }

                    logik.behandlaRad(rad);
                }

                // Skriv ut resultaten
                System.out.println("Antal tecken: " + logik.getTecken());
                System.out.println("Antal rader: " + logik.getRader());
                System.out.println("Antal ord: " + logik.getOrd());
                System.out.println("Längsta ordet: " + logik.getLangstaOrd());

                scanner.close();
            }
        }