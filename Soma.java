import java.util.Scanner;

public class Soma {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        int soma = 0;
        for (int i = 0; i < numero; i++) {
            soma += i;
        }

        System.out.println("A soma dos números anteriores a " + numero + " é " + soma);

        scanner.close();
    }

}
