import java.util.Scanner;

public class Valores {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor de i: ");
        int i = scanner.nextInt();

        System.out.println("Digite os valores de a, b e c: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        if (i == 1) {
            if (a <= b && a <= c) {
                if (b <= c) {
                    System.out.println(a + ", " + b + ", " + c);
                } else {
                    System.out.println(a + ", " + c + ", " + b);
                }
            } else if (b <= a && b <= c) {
                if (a <= c) {
                    System.out.println(b + ", " + a + ", " + c);
                } else {
                    System.out.println(b + ", " + c + ", " + a);
                }
            } else {
                if (a <= b) {
                    System.out.println(c + ", " + a + ", " + b);
                } else {
                    System.out.println(c + ", " + b + ", " + a);
                }
            }
        } else if (i == 2) {
            if (a >= b && a >= c) {
                if (b >= c) {
                    System.out.println(a + ", " + b + ", " + c);
                } else {
                    System.out.println(a + ", " + c + ", " + b);
                }
            } else if (b >= a && b >= c) {
                if (a >= c) {
                    System.out.println(b + ", " + a + ", " + c);
                } else {
                    System.out.println(b + ", " + c + ", " + a);
                }
            } else {
                if (a >= b) {
                    System.out.println(c + ", " + a + ", " + b);
                } else {
                    System.out.println(c + ", " + b + ", " + a);
                }
            }
        } else if (i == 3) {
            double max = Math.max(a, Math.max(b, c));
            double min = Math.min(a, Math.min(b, c));
            double middle = a + b + c - max - min;

            System.out.println(max + ", " + middle + ", " + min);
        } else {
            System.out.println("Valor de i inválido.");
        }
    }
}
