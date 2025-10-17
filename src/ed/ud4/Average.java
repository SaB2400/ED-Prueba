import java.util.Random;

public class Average {
    public static void main(String[] args) {
        Random random = new Random();

        int count = random.nextInt(20);
        System.out.println("Numeros totales:" + count);

        int sum = 0;
        System.out.print("Numeros generados:");
        for (int i = 0; i < count; i++) {
            int num = random.nextInt(50) + 1;
            System.out.print(num + " ");
            sum += num;
        }

        System.out.println("\nSuma total:" + sum);
    }
}