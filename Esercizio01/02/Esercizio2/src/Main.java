import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Inserisci il numero di km percorsi (0 per uscire): ");
                double kmPercorsi = scanner.nextDouble();

                if (kmPercorsi == 0) {
                    System.out.println("Arrivederci!");
                    break;
                }

                System.out.print("Inserisci i litri di carburante consumati: ");
                double litriConsumati = scanner.nextDouble();

                if (litriConsumati == 0) {
                    throw new ArithmeticException("Errore. Il numero di litri non può essere zero.");
                }

                double kmPerLitro = kmPercorsi / litriConsumati;
                System.out.println("Km/litro: " + kmPerLitro);

            } catch (ArithmeticException e) {
                System.out.println("Errore: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Errore generico: " + e.getMessage());
                scanner.nextLine();
            }
        }

    }
}