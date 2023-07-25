import java.util.Scanner;

public class MediaPond {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe a: ");
        double a = entrada.nextDouble();

        System.out.print("Informe b: ");
        double b = entrada.nextDouble();

        System.out.print("Informe c: ");
        double c = entrada.nextDouble();

        double mediaPond = calcMediaPond(a, b, c);

        System.out.println("A média ponderada é: " + mediaPond);
    }

    public static double calcMediaPond(double a, double b, double c) {
        double media;
        double pesoA = (a > 6) ? 5 : 2.5;
        double pesoB = (b > 6) ? 5 : 2.5;
        double pesoC = (c > 6) ? 5 : 2.5;

        media = (a * pesoA + b * pesoB + c * pesoC) / (pesoA + pesoB + pesoC);

        return media;
    }
}
