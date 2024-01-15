import java.util.Scanner;

public class ManejoExcepciones {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ejemplo 1: División entre cero
        try {
            System.out.println("Ingrese el numerador:");
            int numerador = scanner.nextInt();

            System.out.println("Ingrese el denominador:");
            int denominador = scanner.nextInt();

            int resultado = dividir(numerador, denominador);
            System.out.println("Resultado de la división: " + resultado);

        } catch (ArithmeticException e) {
            System.out.println("Error: División entre cero. " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error general: " + e.getMessage());
        }

        // Ejemplo 2: Índice fuera de rango en un array
        try {
            int[] array = {1, 2, 3};
            System.out.println("Ingrese el índice para acceder al array:");
            int indice = scanner.nextInt();

            int valor = obtenerValor(array, indice);
            System.out.println("Valor en el índice " + indice + ": " + valor);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Índice fuera de rango. " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error general: " + e.getMessage());
        }

        // Ejemplo 3: Conversión de cadena a número
        try {
            System.out.println("Ingrese un número como cadena:");
            String cadenaNumero = scanner.next();

            int numero = convertirANumero(cadenaNumero);
            System.out.println("Número convertido: " + numero);

        } catch (NumberFormatException e) {
            System.out.println("Error: No se pudo convertir la cadena a número. " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error general: " + e.getMessage());
        }

        scanner.close();
    }

    private static int dividir(int numerador, int denominador) {
        return numerador / denominador;
    }

    private static int obtenerValor(int[] array, int indice) {
        return array[indice];
    }

    private static int convertirANumero(String cadenaNumero) {
        return Integer.parseInt(cadenaNumero);
    }
}
