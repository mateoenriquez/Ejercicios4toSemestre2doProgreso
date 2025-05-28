import java.util.ArrayList;
import java.util.Scanner;

public class BurbujaOrdenamiento {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa los números separados por espacios:");
        String entrada = scanner.nextLine();
        String[] partes = entrada.trim().split("\\s+");

        // Convertimos a lista de enteros
        int[] numeros = new int[partes.length];
        for (int i = 0; i < partes.length; i++) {
            numeros[i] = Integer.parseInt(partes[i]);
        }

        // Ordenamiento burbuja
        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = 0; j < numeros.length - i - 1; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    int temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                }
            }
        }

        // Mostrar el resultado
        System.out.println("Números ordenados:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
    }
}
