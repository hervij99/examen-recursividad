import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de elementos del arreglo: ");
        int n = scanner.nextInt();

        int[] arr = ingresarElementos(scanner, n, 0);

        int resultado = sumarArreglo(arr, n - 1);
        System.out.println("La suma de los elementos del arreglo es: " + resultado);
    }

    public static int[] ingresarElementos(Scanner scanner, int n, int indice) {
        if (indice == n) {
            return new int[n];
        } else {
            int[] arr = ingresarElementos(scanner, n, indice + 1);
            System.out.print("Ingrese el elemento " + (indice + 1) + ": ");
            arr[indice] = scanner.nextInt();
            return arr;
        }
    }

    public static int sumarArreglo(int[] arr, int indice) {
        if (indice == 0) {
            return arr[0];
        } else {
            return arr[indice] + sumarArreglo(arr, indice - 1);
        }
    }
}