//  María de la Luz Farfán Martínez         3007517
// Rámses González Valencia
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[20];
        /*
        Si el usuario ingresa algo que no es un número entero, el programa mostrará un mensaje de error
        y permitirá al usuario ingresar otro número, porque luego no sabemos,
        después se imprimirán los números ingresado en la consola.
         */
        System.out.println("Por favor, ingresa 20 números enteros, uno por uno:");
        
        for (int i = 0; i < 20; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            if (scanner.hasNextInt()) {
                numeros[i] = scanner.nextInt();
            } else {
                System.out.println("Entrada no válida. Por favor ingresa un número entero");
                scanner.next(); // Limpia el búfer de entrada
                i--; // Decrementa el índice para repetir la entrada del número.
            }
        }

        // Imprimir los números ingresados
        System.out.println("\nLos números ingresados son:");
        for (int i = 0; i < 20; i++) {
            System.out.println(numeros[i]);
        }

        scanner.close();
    }
}