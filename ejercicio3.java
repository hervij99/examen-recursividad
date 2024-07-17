import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de elementos: ");
        int n = scanner.nextInt();

        int[] arreglo = ingresarElementos(scanner, n);
        imprimirInvertido(arreglo, n - 1);
    }

    public static int[] ingresarElementos(Scanner scanner, int n) {
        if (n == 0) {
            return new int[0];
        } else {
            int[] arreglo = ingresarElementos(scanner, n - 1);
            int[] nuevoArreglo = new int[n];
            for (int i = 0; i < n - 1; i++) {
                nuevoArreglo[i] = arreglo[i];
            }
            System.out.print("Ingrese el elemento " + n + ": ");
            nuevoArreglo[n - 1] = scanner.nextInt();
            return nuevoArreglo;
        }
    }

    public static void imprimirInvertido(int[] arreglo, int indice) {
        if (indice >= 0) {
            System.out.print(arreglo[indice] + " ");
            imprimirInvertido(arreglo, indice - 1);
        }
    }
}