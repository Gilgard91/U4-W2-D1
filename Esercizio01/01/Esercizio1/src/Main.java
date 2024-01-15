import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int[] array = generateRandomArray(5, 1, 10);
        printArray(array);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Inserisci un numero (0 per uscire): ");
                int numero = scanner.nextInt();

                if (numero == 0) {
                    System.out.println("Arrivederci!");
                    break;
                }

                System.out.print("Inserisci la posizione: ");
                int posizione = scanner.nextInt();

                if (posizione < 0 || posizione >= array.length) {
                    throw new ArrayIndexOutOfBoundsException("Errore. Inserire una posizione valida");
                }

                array[posizione] = numero;
                printArray(array);

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Errore: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Errore generico: " + e.getMessage());
                scanner.nextLine();
            }
        }
    }

    private static int[] generateRandomArray(int length, int min, int max) {
        Random random = new Random();
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = random.nextInt(max - min + 1) + min;
        }
        return array;
    }

    private static void printArray(int[] array) {
        System.out.print("Array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}