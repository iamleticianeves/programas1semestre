public class DecimalBinario {
    public static void main(String[] args) {
        decimalBinario(10);
    }

    private static void decimalBinario(int n) {
        if (n > 0) {
            decimalBinario(n / 2);
            System.out.print(n % 2);
        }
    }

}
