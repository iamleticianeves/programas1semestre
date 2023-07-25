public class Somatorio {

    public static void main(String[] args) {
        double somaA = 0;
        double somaB = 0;

        for (int i = 1; i <= 99; i += 2) {
            somaA += 1.0 / i;
        }
        int sinal = 1;
        for (int i = 1; i <= 20; i += 2) {
            somaB += sinal * (1.0 / i);
            sinal *= -1;
        }

        System.out.println("Soma da série a: " + somaA);
        System.out.println("Soma da série b: " + somaB);
    }
}
