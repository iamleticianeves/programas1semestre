import java.util.Scanner;

public class NumeroPerfeito {
    public static boolean verificarNumeroPerfeito(int n) {
        int somaDivisores = 0;

        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                somaDivisores += i;
            }
        }

        return somaDivisores == n;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int numero = scanner.nextInt();

        scanner.close();

        if (verificarNumeroPerfeito(numero)) {
            System.out.println(numero + " é um número perfeito.");
        } else {
            System.out.println(numero + " não é um número perfeito.");
        }
    }
}
