import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingrese el número para calcular el factorial: ");
            int n = scanner.nextInt();
            System.out.print("Ingrese la base de la potencia: ");
            int base = scanner.nextInt();
            System.out.print("Ingrese el exponente de la potencia: ");
            int exponente = scanner.nextInt();

            int factorial = calcularFactorial(n);
            int potencia = calcularPotencia(base, exponente);
            long resultado = multiplicar(factorial, potencia);

            System.out.println("El resultado de " + n + "! x " + base + "^" + exponente + " es: " + resultado);
        }
    }

    public static int calcularFactorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * calcularFactorial(n - 1);
        }
    }

    public static int calcularPotencia(int base, int exponente) {
        if (exponente == 0) {
            return 1;
        } else {
            return base * calcularPotencia(base, exponente - 1);
        }
    }

    public static long multiplicar(int a, int b) {
        if (b == 0) {
            return 0;
        } else {
            return (long)a + multiplicar(a, b - 1);
        }
    }
}