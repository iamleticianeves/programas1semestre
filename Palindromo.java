import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int number = entrada.nextInt();

        if (Palindromo(number)) {
            System.out.println(number + " é um número palíndromo.");
        } else {
            System.out.println(number + " não é um número palíndromo.");
        }
    }

    public static boolean Palindromo(int number) {
        int originalNumber = number;
        int reversedNumber = 0;

        while (number != 0) {
            int remainder = number % 10;
            reversedNumber = reversedNumber * 10 + remainder;
            number /= 10;
        }

        return originalNumber == reversedNumber;

    }
}
