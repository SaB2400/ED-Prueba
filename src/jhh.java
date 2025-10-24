import java.util.Scanner;

public class jhh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de números: ");
        int n = scanner.nextInt();
        System.out.print("Statistics");
        if (n <= 0) {
            System.out.println("La cantidad de números debe ser mayor que 0");
            return;
        }
        double producto = 1.0;
        int min = 100;
        int max = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            double numero = scanner.nextDouble();

            if (numero <= 0) {
                System.out.println("Los números deben ser positivos");
                return;
            }
            if (numero < min) {
                min = numero;
            }
            if (numero > max) {
                max = numero;
            }
            producto *= numero;
        }

        double mediaGeometrica = Math.pow(producto, 1.0 / n);

        // Mostrar el resultado
        System.out.printf("La media geométrica es: %.4f%n", mediaGeometrica);

        scanner.close();
        System.out.print("End of program");
    }
}
